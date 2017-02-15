/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.net.*;
/**
 *
 * @author Rey Meljohn S. Guieb
 */
public class testing1 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6123);
            while(true){
                Socket s = ss.accept();
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
               	while(true){
               		dos.writeBytes("");
                	String number = dis.readLine()+"\r";
					try{
                		if(Double.parseDouble(number) > 0){
                    		dos.writeBytes("the number is positive \r\n");
                		}

                		if(Double.parseDouble(number) == 0){
                    		dos.writeBytes("the number is zero \r\n");
                		}

                		if(Double.parseDouble(number) < 0){
                  		  	dos.writeBytes("the number is negative \r\n");
                		}

					}catch (NumberFormatException f){
						if(number.equalsIgnoreCase("exit\r")){
							s.close();
						}else {
							dos.writeBytes("not a number \r\n");
						}
					}
               	}
           }
        }catch (Exception e) {
            System.out.println("No Connection");
        }
    }
}
