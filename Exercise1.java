package exercise1;
import java.net.InetAddress;
import java.util.Scanner;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 *
 * @author Guieb, Rey Meljohn S.
 */
public class Exercise1 {
    public static void main(String[] args) throws UnknownHostException {
       InetAddress [] ia;
       Scanner kbd = new Scanner(System.in);
       String input = "y";
       String hostname;
       
       while(input.equals("y")){
           System.out.print("Enter hostname: ");
           hostname = kbd.nextLine();
           
           ia = InetAddress.getAllByName(hostname);
           
           System.out.println("Number of Hosts/ip: " +ia.length);
           
           for(int i = 0; i < ia.length; i++){
                System.out.println("host/ip --- " +ia[i]);
           }
           System.out.print("Search Another? [y]/[n] ");
           input = kbd.nextLine();
       }
    System.exit(0);
    }
    
}
