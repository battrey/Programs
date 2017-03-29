import java.rmi.*;

public interface Chat extends Remote {
        // method to register a User in the chat server
        // returns true if the registration is successful
        // returns false if the user is existing or user name or password is blank
        public boolean register(User u) throws RemoteException;
        // method to login a registered user
        // returns true if user is registered and not currently logged in and most
        //              importantly, the password matches the user's data
        // returns false if user is unregistered, currently logged in, or
        //              or password does not match user's data
        public boolean login(User u) throws RemoteException;
        // method to logout a registered user
        // returns true if user is currently logged in
        // returns false if user is unregistered, currently not logged in
        public boolean logout(User u) throws RemoteException;
        // note: data can be saved in memory only.
}