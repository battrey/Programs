import javax.xml.ws.Endpoint;
import hello.*;

public class WSServer {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/hello/myhello",new HelloWorld());
    }
}