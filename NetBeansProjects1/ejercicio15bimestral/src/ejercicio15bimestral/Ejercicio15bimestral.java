package ejercicio15bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Ejercicio15bimestral {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
		double num_m;
		double num_n;
		double operacion;
		double rta;
		System.out.println("ingrese el número n");
		num_n = leer.nextDouble();
		System.out.println("ingrese el número m");
		num_m = leer.nextDouble();
		System.out.println("ingrese el número que desee: suma=1,resta=2, multiplicación=3, división=4 y, potenciación=5");
		operacion = leer.nextDouble();
		if (operacion==1) {
			rta = num_n+num_m;
			System.out.println("la espuesta es: "+rta);
		}
		if (operacion==2) {
			rta = num_n-num_m;
			System.out.println("la espuesta es: "+rta);
		}
		if (operacion==3) {
			rta = num_n*num_m;
			System.out.println("la espuesta es: "+rta);
		}
		if (operacion==4) {
			rta = num_n/num_m;
			System.out.println("la espuesta es: "+rta);
		}
		if (operacion==5) {
			rta = Math.pow(num_n,num_m);
			System.out.println("la espuesta es: "+rta);
		}  
        // TODO code application logic here
    }
}
