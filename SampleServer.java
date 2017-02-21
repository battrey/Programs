/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s326lab
 */
import java.io.*;
import static java.lang.Character.isDigit;
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
                                boolean loop=true;
                                
                                    
                                dos.writeBytes("addition expression evaluator \r\n");
                                while(loop){
                                    try{
                                    String input = dis.readLine();
                                    if(input.equals("exit")){
                                        loop=false;
                                        s.close();
                                    }
                                    
                                        String[] parts = input.split("\\+");
                                        if(parts.length == 2){
                                        String part1 = parts[0];
                                        String part2 = parts[1];
                                        
                                        double aa = Double.parseDouble(part1);
                                        double cc = Double.parseDouble(part2);
                                        dos.writeBytes(aa+cc+"\r\n");
                                        }
                                        else{
                                            dos.writeBytes("invalid expression \r\n");
                                        }
                                    


                                    }
                                    catch(Exception asd){
                                        dos.writeBytes("invalid expression \r\n");
                                    }
                                }
			}
		} catch (Exception e) {
			System.out.println("problem starting the server...");
		}
    }
}