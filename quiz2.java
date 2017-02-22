package javaapplication6;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Rey Meljohn S. Guieb
 */
public class quiz2 {
    public static void main(String[] args) {
        try {
            int port = 25874;
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server running on port " + port);
            while (true) {
                Socket s = server.accept();
                String S;
                int N;
                DataInputStream dis = new DataInputStream(s.getInputStream());
                DataOutputStream dos = new DataOutputStream(s.getOutputStream());
                while (true) {
                    try {
                        S = dis.readLine().trim();
                        N = Integer.parseInt(dis.readLine().trim());
                       	System.out.print(S.length());

                        if (S.equalsIgnoreCase("exit")) {
                            s.close();
                            break;
                        }

                        char letter = S.charAt(N);
                        S = String.valueOf(letter);

                        if(S.equalsIgnoreCase("a") || S.equalsIgnoreCase("e") || S.equalsIgnoreCase("i")|| S.equalsIgnoreCase("o") || S.equalsIgnoreCase("u")){
                           dos.writeBytes("vowel\r\n");
                        }else{
                            dos.writeBytes("not vowel\r\n");
                        }

try{
	if(S.length() <= N){
    }

}catch(Exception e){
	dos.writeBytes("invalid N \r\n");
}


                    } catch (Exception e) {
                        dos.writeBytes("not vowel \r\n");
                        System.err.println(e.getMessage());
                    }
                }
            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}
