import java.net.*;
import java.io.*;
public class Quiz1Answer {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("10.10.22.199",13579);
            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());
            dos.writeBytes("<your name>\r\n");
            int n1 = Integer.parseInt(dis.readLine().trim());
            int n2 = Integer.parseInt(dis.readLine().trim());
            int prod = n1*n2;
            dos.writeBytes(prod+"\r\n");
            System.out.println(dis.readLine());
        } catch (IOException ex) {
            System.out.println("problem connecting to quiz server");
        }
    }
}
