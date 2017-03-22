import java.rmi.*;
import java.util.Calendar;

public interface Quiz extends Remote {
	public String dotw(int m, int d, int y) throws RemoteException;
	public int age(Calendar birthDate) throws RemoteException;
	public boolean leapYear(int year) throws RemoteException;
}