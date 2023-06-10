package ejercicio10bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicio10bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
		double n_alum;
		System.out.println("ingrese el número de alumnos");
		n_alum = leer.nextDouble();
		if ((n_alum>100)) {
			System.out.println("el costo es de $20");
		}
		if ((n_alum>50) & (n_alum<100)) {
			System.out.println("el costo es de $35");
		}
		if ((n_alum>20) & (n_alum<49)) {
			System.out.println("el costo es de $40");
		}
		if ((n_alum<20)) {
			System.out.println("el costo es de $70");
		}
     }     
        // TODO code application logic here
    }
    
}
