package ejercicio8bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicio8bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
        double edad;
		double sexo;
		System.out.println("ingrese su edad");
		edad = leer.nextDouble();
		System.out.println("ingrese su sexo(1 si es mujer y 2 si es hombre)");
		sexo = leer.nextDouble();
		if (edad>70) {
			System.out.println("le correspone la vacuna tipo C");
		}
		if ((edad>16) & (edad<59) & (sexo==1)) {
			System.out.println("le correspone la vacuna tipo B");
		}
		if ((edad>16) & (edad<59) & (sexo==2)) {
			System.out.println("le correspone la vacuna tipo A");
		}
		if ((edad<16)) {
			System.out.println("le correspone la vacuna tipo A");
		}
     }
         // TODO code application logic here
    }
    
}
