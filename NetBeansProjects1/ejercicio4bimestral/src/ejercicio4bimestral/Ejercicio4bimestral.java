package ejercicio4bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicio4bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
        
		
		double nota;
		System.out.println("ingrese la nota a leer");
		nota = leer.nextDouble();
		if ((nota<=5)) {
			System.out.println("Calificación: F");
		}
		if ((nota>=6) & (nota<8)) {
			System.out.println("Calificación: D");
		}
		if ((nota>=8) & (nota<9)) {
			System.out.println("Calificación: C");
		}
		if ((nota>=9) & (nota<10)) {
			System.out.println("Calificación: B");
		}
		if (nota==10) {
			System.out.println("Calificación: A");
		}
	}
        // TODO code application logic here
    }
    
}
