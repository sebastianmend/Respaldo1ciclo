package numero.par;

import java.util.Scanner;//el programa usa la clase scanner
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class NumeroPar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Scanner leer=new Scanner(System.in);
      int n;
      System.out.println("Programa para verificar si un número es par o impar");
      System.out.print ("Ingrese el número a verificar: ");
      n = leer.nextInt (); //ingresa el número
      //Condición para verificar si el número es par 0 impar
        if (n % 2 == 0) {

        System.out.println("El número " +n+" es par");
     
        }       
        
        // TODO code application logic here
    }
    
}
