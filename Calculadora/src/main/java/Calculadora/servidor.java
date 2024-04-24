/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**
 *
 * @author winst
 */
public class servidor {
  
    public static void main(String[] args) {
        
                try{
        

            Registry r  = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("calculadora",new rmi());
           JOptionPane.showMessageDialog(null,"Conetado el servidor");
        }catch(Exception e){
               JOptionPane.showMessageDialog(null,"No hubo conexion existosa"+e);

            }
}
}