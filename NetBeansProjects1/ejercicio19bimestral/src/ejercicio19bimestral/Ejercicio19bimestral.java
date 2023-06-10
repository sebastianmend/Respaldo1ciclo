package ejercicio19bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicio19bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
		double horas;
		double i;
		double pago;
		double sueldo;
		double total_h;
		System.out.println("ingrese el pago por hora");
		pago = leer.nextDouble();
                i=1;
                total_h=0;
                sueldo=0;
		while (i<=6) {
			System.out.println("ingrese las horas trabajadas en un dia");
			horas = leer.nextDouble();
			total_h = total_h+horas;
			sueldo = sueldo+(horas*pago);
			i = i+1;
		}
		System.out.println("EL sueldo a recibir, es: "+sueldo);

        // TODO code application logic here
    }
    
}
