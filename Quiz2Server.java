import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Quiz2Server {

    public static void main(String[] args) {
        try {
            int port = 25874;
            ServerSocket server = new ServerSocket(port);
            System.out.println("Server running on port " + port);
            while (true) {
                Socket S = server.accept();
                String N;
                char s;
                DataInputStream dis = new DataInputStream(S.getInputStream());
                DataOutputStream dos = new DataOutputStream(S.getOutputStream());
                String inputStr;
                dos.writeBytes("string evaluator\r\n");
                while (true) {
                    try {
                        N = dis.readLine();
                        if (N.equalsIgnoreCase("exit")) {
                            S.close();
                            break;
                        }
                        System.out.println(N);

                        if(N.equalsIgnoreCase("a") || N.equalsIgnoreCase("e") || N.equalsIgnoreCase("i")|| N.equalsIgnoreCase("e") || N.equalsIgnoreCase("u")){
                            dos.writeBytes("vowel\r\n");
                        }else{
                            dos.writeBytes("not vowel\r\n");
                        }

                    } catch (IOException e) {
                        dos.writeBytes("not a vowel\r\n");
                        System.err.println(e.getMessage());
                    }
                }

            }
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }
}