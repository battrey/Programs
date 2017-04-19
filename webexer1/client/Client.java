import hello.*;
import javax.xml.ws.WebServiceRef;
public class Client {
  @WebServiceRef(wsdlLocation="http://localhost:8080/hello/myhello")
  public static void main(String[] args) {
    try {
        HelloWorldService hws = new HelloWorldService();
        HelloWorld hw = hws.getHelloWorldPort();
        System.out.println("");
        System.out.println("from the server: "+hw.sayHello("Rey Meljohn S. Guieb"));
    } catch(Exception e) {
    	e.printStackTrace();
    }
  }
}