package ejercicio13bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicio13bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
      Scanner leer=new Scanner(System.in);{
		double venta;
		System.out.println("ingrese el monto de venta alcanzado");
		venta = leer.nextDouble();
		if ((venta>=0) & (venta<1000)) {
			System.out.println("su bonificación es de: 100");
		}
		if ((venta>=1000) & (venta<5000)) {
			System.out.println("su bonificación es de: 500");
		}
		if ((venta>=5000) & (venta<20000)) {
			System.out.println("su bonificación es de: 1000");
		}
		if ((venta>=20000)) {
			System.out.println("su bonificación es de: 2000");
		}
	}
        // TODO code application logic here
    }
    
}
