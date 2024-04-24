import java.rmi.*;
import java.net.*;
import java.io.*;

public class HelloServer {


    public static void main(String[] args) {
      try {
        HelloImpl localobj=new HelloImpl();
        Naming.rebind("rmi:///HelloWorld",localobj);


      } catch (RemoteException re) {re.printStackTrace();}
      catch(MalformedURLException mfe) {mfe.printStackTrace();}
      }  

        
    }
    

