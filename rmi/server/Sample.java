import java.rmi.*;
public interface Sample extends Remote{
	String test(String name) throws RemoteException;
}