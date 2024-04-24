/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author winst
 */ 
public class rmi extends UnicastRemoteObject implements calculadora{
    public rmi() throws RemoteException{
    int a,b;
    
    }
    
    public int add(int a,int b)throws RemoteException{
        
        return a+b;
    }
     public int sub(int a,int b)throws RemoteException{
        
        return a-b;
    }
      public int mul(int a,int b)throws RemoteException{
        
        return a*b;
    }
       public int div(int a,int b)throws RemoteException{
        
        return a/b;
    }
    
}
