import sample.*;
import javax.xml.ws.WebServiceRef;
public class Client {
  @WebServiceRef(wsdlLocation="http://10.10.22.104:8080/sample/sample")
  public static void main(String[] args) {

    try {
        ExerciseService serv = new ExerciseService();
        Exercise ex2 = serv.getExercisePort();
        String name = "Meljohn Guieb";
        String salt = ex2.register(name);
        boolean validate = ex2.validate(name, salt);
        System.out.println("registered: " + name + " salt key: " + salt);
        System.out.println("Matched? " +validate);


    } catch(Exception e) {
    	e.printStackTrace();
    }
  }
}