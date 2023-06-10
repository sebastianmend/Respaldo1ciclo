package ejercicio1bimestral;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Ejercicio1bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);{
      
            double dinero;
		System.out.println("Ingrese el dinero que va a recibir el empleado en diciembre");
		dinero = leer.nextDouble();
		if (dinero>=500) {
			System.out.println("Usted puede comprar una televisión, un modular, tres pares de zapatos, cinco camisas y cinco pantalones");
		}
		if ((dinero<500) & (dinero>=200)) {
			System.out.println("Usted puede comprar una grabadora, tres pares de zapatos, cinco camisas y cinco pantalones");
		}
		if ((dinero<200) & (dinero>=100)) {
			System.out.println("Usted puede comprar dos pares de zapatos, tres camisas y tres pantalones.");
		}
		if (dinero<100) {
			System.out.println("Usted puede comprar un par de zapatos, dos camisas y dos pantalones.");
		}
        
        
        
        
         }
  // TODO code application logic here
    }
    
}
