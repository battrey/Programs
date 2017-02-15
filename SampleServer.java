import java.io.*;
import java.net.*;

public class SampleServer {
    public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(6000);
			// sequential non-threaded server
			while (true) {
				Socket s = ss.accept();
				DataInputStream dis = new DataInputStream(s.getInputStream());
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				dos.writeBytes("hello client, what is your name? \r\n");
				String name = dis.readLine();
				dos.writeBytes("nice meeting you, "+name+" \r\n");
				s.close();
			}
		} catch (Exception e) {
			System.out.println("problem starting the server...");
		}
    }
}
