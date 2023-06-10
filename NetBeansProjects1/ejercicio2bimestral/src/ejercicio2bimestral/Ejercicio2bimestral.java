package ejercicio2bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Ejercicio2bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
		double bonot;
		double sueldo;
		double tiempo;
		double tiempo_d;
		bonot = 0;
		System.out.println("Ingrese su tiempo trabajando en la empresa (en años)");
		tiempo = leer.nextDouble();
		tiempo_d = tiempo*365;
		System.out.println("ingrese su sueldo");
		sueldo = leer.nextDouble();
		if ((tiempo_d>sueldo)) {
			if ((tiempo>2) & (tiempo<5)) {
				bonot = sueldo*0.2;
			}
			if (tiempo>=5) {
				bonot = sueldo*0.3;
			}
		} else {
			if (sueldo<1000) {
				bonot = sueldo*0.25;
			}
			if ((sueldo>1000) & (sueldo<=2500)) {
				bonot = sueldo*0.15;
			}
			if ((sueldo>2500)) {
				bonot = sueldo*0.1;
			}
		}
		System.out.println("su bono a recibir es: "+bonot);
	}

        // TODO code application logic here
    }
    
}
