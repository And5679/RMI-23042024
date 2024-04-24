/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculadora;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author winst
 */
public class cliente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            Registry miRegistro = LocateRegistry.getRegistry("localhost", 1099);
            calculadora c = (calculadora)Naming.lookup("//localhost/calculadora");

            while (true) {
                String menu=JOptionPane.showInputDialog("""
                                                         Calculadora Basica RMI 
                                                          Seleccione la opcion
                                                          1 a 4 
                                                         Ingrese(1)..SUMAR\n
                                                         Ingrese(2)..RESTA\n
                                                         Ingrese(3)..MULTIPLICAR\n
                                                         Ingrese(4)..DIVIDIR\n
                                                        Click boton cancelar para salir""");
                switch (menu) {

                    case "1" ->  {

                        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero para sumar"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para sumar"));

                        JOptionPane.showMessageDialog(null, "La suma es: " + c.add(x, y));
                    }
                    case "2" -> {
         int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero para restar"));
         int y =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para restar"));
         JOptionPane.showMessageDialog(null, "La resta es: " + c.sub(x, y));
         
                    }
                    
                    case "3" -> {
                    
         int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero multiplicar"));
         int y =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para multiplicar"));
         JOptionPane.showMessageDialog(null, "La multiplicacion es: " + c.mul(x, y));
                    }
                    
                    case "4" -> {
                    
         int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero dividir"));
         int y =Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero para dividir"));
         JOptionPane.showMessageDialog(null, "La division es: " + c.div(x, y));                    }  
                }
                
            }
        }catch(Exception e){
            System.out.println("Servidor no conectado"+e);
        }
    }
}
