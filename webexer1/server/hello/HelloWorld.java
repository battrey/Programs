// all web services (implementations)
// must be placed in a package
package hello;

import javax.jws.WebService;
import javax.jws.WebMethod;

// annotation; a j2se 5 feature
@WebService
public class HelloWorld {
    @WebMethod
    public String sayHello(String n) {
        System.out.println("sending message: "+n);
        return "hello, "+n+"!";
    }
}