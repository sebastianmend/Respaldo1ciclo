package grados.cent;
import java.util.Scanner;//el programa usa la clase scanner
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class GradosCent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double gC, gF, gK; //declaración de variables   
        
        System.out.println("Programa para transformar de grados centígrados"
                 + "a grados Farenheit y a grados Kelvin \n");
        
        System.out.print ("Ingrese la temperatura en grados centígrados: ");
        gC = leer.nextDouble(); //ingresa los grados centígrados
                                //Verifica si temperatura en grados centigrados es positiva

        if (gC > 0) {
        gF = (gC * 9/5)+ 32; // tranforma a grados Farenheit
        gK = gC + 273.15; // tranforma a grados Kelvin
        //Presenta los valores obtenidos
         System.out.println("La equivalencia en grados F es: " +gF+"\n");
         
         System.out.println("La equivalencia en grados K es: " +gK);
         }
// TODO code application logic here
    }
    
}
