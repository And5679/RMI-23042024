import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class HelloImpl extends UnicastRemoteObject implements HelloWorld{


	public HelloImpl() throws RemoteException{}
	public String display() throws RemoteException{


		return(" HelloWorld  from Server");
	}
}