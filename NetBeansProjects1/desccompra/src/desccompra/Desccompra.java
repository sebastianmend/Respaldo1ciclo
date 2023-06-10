
package desccompra;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Desccompra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        // declaración e inicialización de variables 
        double subtotal, total, descuento, limitel, limite2; 
        
        limitel= 200; 
        limite2 = 500;
        
        System.out.println("Calcular el valor de una factura de venta"); 
        System.out.println("Para compras mayores a USD 200, se aplica un 10% "
                +"de descuento"); 
        System.out.println("Para compras mayores a USD 500, se aplica un %15 de descuento\n");

        System.out.print ("Ingrese el subtotal de la compra: ");
        subtotal=leer.nextDouble(); //ingresa el subtotal de la compra

        //Verifica el subtotal de compra para asignar el valor del descuento
        if ((subtotal >= limitel) & (subtotal< limite2))
        {
          descuento=0.10;
        }
         else
        {
         descuento = 0.15;
         }
         total = subtotal - (subtotal * descuento); 
         //calcula el total de compra

         System.out.println("El total de la compra " +total);
         }
                
        //TODO code application logic here
         
    
}
