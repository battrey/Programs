package exercises;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args){
        Scanner kbd = new Scanner(System.in);
        //System.out.print("SMTP server: ");
        //String server = kbd.nextLine();
        //System.out.print("Port: ");
        //int port = Integer.parseInt(kbd.nextLine());
        boolean loop = true;
        try {
            Socket s = new Socket("smtpdsl4.pldtdsl.net", 587);
            String input = "";
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            while(loop){
                dis = new DataInputStream(s.getInputStream());
                dos = new DataOutputStream(s.getOutputStream());
                System.out.println("S: "+dis.readLine());
                if(input.equalsIgnoreCase("QUIT \r \n")){
                    System.exit(0);
                }
                System.out.print("C: ");
                input = kbd.nextLine()+" \r \n";
                dos.writeBytes(input);
                input = "";
            }
        } catch (java.io.IOException e) {
            System.err.println("Error connecting.");
        }
    }
}