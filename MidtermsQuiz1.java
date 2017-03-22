import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.*;
import java.util.*;
public class MidtermsQuiz1 extends UnicastRemoteObject implements Quiz {

    public MidtermsQuiz1() throws RemoteException {
    }

    public static void main(String[] args) {
    	try {
			Quiz stub = new MidtermsQuiz1();
			Registry reg = LocateRegistry.createRegistry(1099);
            reg.rebind("quiz2", stub);
            System.out.println("Running...");
		} catch (Exception e) {
			e.printStackTrace();
		}
    }

   	public String dotw(int m, int d, int y) throws RemoteException {
		Date date = new Date();
    	Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(y, m, d);
		String month = "";
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		if(leapYear(y) == true){
			if(m == 2){
				if(d > 29){
					return "invalid";
				}
			}
   		}else{
   			if(m == 1) {
   				month = "january";
   			}
   				if(m == 2) {
   				month = "february";
   			}
   				if(m == 3) {
   				month = "march";
   			}
   				if(m == 4) {
   				month = "april";
   			}
   				if(m == 5) {
   				month = "may";
   			}
   				if(m == 6) {
   				month = "june";
   			}
   				if(m == 7) {
   				month = "july";
   			}
   				if(m == 8) {
   				month = "august";
   			}
   				if(m == 9) {
   				month = "september";
   			}
   				if(m == 10) {
   				month = "october";
   			}
   				if(m == 11) {
   				month = "november";
   			}
   				if(m == 12) {
   				month = "december";
   			}
   		}return month+d+y;
   	}

	public boolean leapYear(int year) throws RemoteException {
		 if (year % 4 == 0) {
		 	return true;
		 } else {
		 	return false;
		 }

	}
}