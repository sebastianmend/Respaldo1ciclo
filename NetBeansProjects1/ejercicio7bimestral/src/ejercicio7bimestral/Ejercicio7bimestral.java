package ejercicio7bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicio7bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
        
		double minutos;
		double tiempo;
		double total;
		System.out.println("Ingrese el tiempo que ha estado en el estacionamiento (en minutos)");
		minutos = leer.nextDouble();
		tiempo = minutos/60;
		if ((tiempo<=2)) {
			total = 0.5*tiempo;
			System.out.println("Su total a pagar es: $ "+total);
		}
		if ((tiempo<=5) & (tiempo>2)) {
			total = ((tiempo-2)*0.4)+1;
			System.out.println("Su total a pagar es: $ "+total);
		}
		if ((tiempo<=10) & (tiempo>5)) {
			total = ((tiempo-5)*0.3)+2.2;
			System.out.println("Su total a pagar es: $ "+total);
		}
		if ((tiempo>10)) {
			total = (tiempo*2);
			System.out.println("Su total a pagar es: $ "+total);
		}
	}

     }
  // TODO code application logic here
    }
    
