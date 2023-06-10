package terrenos;

import java.util.Scanner;//el programa usa la clase scanner
/*calcular el área de un terreno 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Terrenos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner leer=new Scanner(System.in);
        double B,c,rta,at,ar,lt,ht;
        System.out.println("Programa para calcular el área de un terrerno propuesto");
        
        System.out.println("ingrese el lado A del terreno");
             lt=leer.nextDouble();
             
        System.out.println("ingrese el lado B del terreno");
             B=leer.nextDouble();
             
        System.out.println("ingrese el lado C del terreno");
             c=leer.nextDouble();
          
             
             at=B*c;
             ht=lt-c;
             ar=(B*ht)/2;
             rta=at+ar;
             
        System.out.printf("El área del terreno es:%,.2f%n", rta);
                     
 
        // TODO code application logic here
    }
    
}
