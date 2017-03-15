import java.rmi.*;
import java.rmi.registry.*;

public class SampleClient {
	public static void main(String args[]) {
        try {
            String name = "mysample";
			// create a registry class and locate the running registry
            Registry registry = LocateRegistry.getRegistry("10.10.22.199",1099);
			// lookup the name of the remote instance in the server and assign it to the named interface using a cast
            Sample comp = (Sample) registry.lookup(name);
			// execute the methods (remotely)
            System.out.println(comp.test("this is my name"));
        } catch (Exception e) {
            System.err.println("rmi error");
            e.printStackTrace();
        }
    }
}