/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author winst
 */
public interface calculadora extends Remote{

   public int div (int a,int b) throws RemoteException;
   public int mul (int a,int b) throws RemoteException;
   public int sub (int a,int b) throws RemoteException;
   public int add (int a,int b) throws RemoteException;

}
