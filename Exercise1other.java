import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;
public class Exercise1{
    public static void main(String[] args){
        initializeInetAddress();
    }   
    public static void initializeInetAddress() {
        String input = inputHostname();
        determineIPName(input);
        searchAgain();
    }   
    public static void determineIPName(String input) {
        try{
            InetAddress[] ia = InetAddress.getAllByName(input);
            System.out.println("Number of Hosts: "+ia.length);
            for (InetAddress ia1 : ia) {
                displayIPName(ia1);
            }
        }catch(UnknownHostException e){
            System.out.println("Some error message.");
        }
    }   
    public static String inputHostname() {
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter hostname/IP address: ");
        String input = kbd.nextLine();
        return input;
    }
    public static void displayIPName(InetAddress ia) {
        System.out.println("Hostname: "+ia.getHostName());
        System.out.println("IP Address: "+ia.getHostAddress());
    }
    public static void searchAgain(){
        Scanner kbd = new Scanner(System.in);
        System.out.print("Search another? [y/n]: ");
        String in = kbd.nextLine();
        if(in.equals("y") || in.equals("Y")){
            initializeInetAddress();
        }else if(in.equals("n") || in.equals("N")){
            System.out.println("Goodbyeee!");
            System.exit(0);
        }
    }
}
