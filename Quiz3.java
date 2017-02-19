package guiclientserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.*;

public class Quiz3{
	public static void main(String [] xyz){
		Scanner yeah = new Scanner(System.in);
		String host = "10.10.22.199";
		int port = 14235;
		String name = "ChristineCabildo";

		try{
			Socket me = new Socket(host,port);
			OutputStream os = me.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			BufferedWriter bw = new BufferedWriter(ow);

			InputStream is = me.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			String message = br.readLine();
			System.out.println("Messaged received : " + message);

			System.out.print("Enter message : " + name);
			String msg1 = yeah.next();


			String sendMsg1 = msg1 + "\n";
			bw.write(sendMsg1);
			bw.flush();
			System.out.println("Message to server : " + sendMsg1);


			 is = me.getInputStream();
			 ir = new InputStreamReader(is);
			 br = new BufferedReader(ir);
			String message1 = br.readLine();
			System.out.println("Messaged received : " + message1);



			String sendMsg2 = message1 + "\n";
			bw.write(sendMsg2);
			bw.flush();
			System.out.println("Message to server : " + sendMsg2);

			 is = me.getInputStream();
			 ir = new InputStreamReader(is);
			 br = new BufferedReader(ir);
			String message2 = br.readLine();
			System.out.println("Messaged received : " + message2);





		}
		catch (Exception e){
			System.out.print(e);
		}



	}

}