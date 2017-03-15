import java.rmi.*;

public interface Exercise extends Remote {
	// if parameter n is a positive number, return true, otherwise, false
	public boolean isPositive(int n) throws RemoteException;
	// if parameter n is a negative number, return true, otherwise, false
	public boolean isNegative(int n) throws RemoteException;
	// if parameter n is a zero, return true, otherwise, false
	public boolean isZero(int n) throws RemoteException;
}