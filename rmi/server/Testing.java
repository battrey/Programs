import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
// create a class that will give implementation to the interface above (make sure that the class will extend UnicastRemoteObject and implement the interface above)
public class Testing extends UnicastRemoteObject implements Sample {
	// required throwing of RemoteException due to the super class constructor
	public Testing() throws RemoteException {

	}
	// implementation proper
	public String test(String name) throws RemoteException {
		System.out.println("congrats "+name+"!");
		return "galing mo!!!";
	}
	public static void main(String[] args) {
		try {
			// create instance of class with implementation
			Sample stub = new Testing();
			// create a registry class and start/create a running registry
			Registry reg = LocateRegistry.createRegistry(1099);
			// register the instance of class to the registry using a unique name
            reg.rebind("mysample", stub);
            System.out.println("Sample RMI bound");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}