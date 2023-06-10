package ejercicio18bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicio18bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
		double a;
		double n;
		double num_a;
		double num_b;
		num_a = 0;
		num_b = 0;
		System.out.println("Ingrese un número");
		n = leer.nextDouble();
		for (a=1;a<=n;a++) {
			if (a%2==0) {
				num_b = num_b+11;
				System.out.print("-"+num_b);
			} else {
				num_a = num_a+12;
				System.out.print("+"+num_a);
			}
		}
        // TODO code application logic here
    }
    
}
