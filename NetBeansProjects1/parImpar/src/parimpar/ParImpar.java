package parimpar;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     
     int num = 0; // valor que almacena el número a verificar 
     String tipo = ""; //valor que se le asigna par o impar
     
     System.out.println("Programa para verificar si un número es par o impar");
     
     System.out.print ("Ingrese el número a verificar: ");
     num = leer.nextInt(); //ingresa el número
     
     //Condición para verificar si el número es par 0 impar
     if (num % 2 == 0) {
         tipo = "par"; //Si la condición es verdadera se asigan "par"
     }
     else { 
         tipo = "impar";//Si la condición es falsa se asigan "impar"
     } 
     System.out.println("El número " +num +" es "+tipo);




   

// TODO code application logic here
    }
    
}
