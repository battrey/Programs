import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Exercise2{
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        InetAddress ia;
        System.out.print("Enter host: ");
        String input = kbd.nextLine();
        for (int x = 1; x < 1024; x++) {
            try {
                Socket sock = new Socket(input, x);
                System.out.println("Port: " + x +" ---Connection open!");
                sock.close();
            } catch (IOException ex) {
            }
        }
    }  
}