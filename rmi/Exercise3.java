import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Exercise3 extends UnicastRemoteObject implements Exercise {
	public Exercise3() throws RemoteException {

	}
	public boolean isPositive(int n) throws RemoteException {
		if(n > 0){
			return true;
		}else{
			return false;
		}
	}

	public boolean isNegative(int n) throws RemoteException {
		if(n < 0){
			return true;
		}else{
			return false;
		}
	}

	public boolean isZero(int n) throws RemoteException {
		if (n == 0){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) {
		try {
			// create instance of class with implementation
			Exercise stub = new Exercise3();
			// create a registry class and start/create a running registry
			Registry reg = LocateRegistry.createRegistry(1099);
			// register the instance of class to the registry using a unique name
            reg.rebind("checker", stub);
            System.out.println("Number Checker");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}