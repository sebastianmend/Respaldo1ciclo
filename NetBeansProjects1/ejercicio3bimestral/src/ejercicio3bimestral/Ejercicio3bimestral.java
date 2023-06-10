package ejercicio3bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicio3bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		Scanner leer=new Scanner(System.in);{
        
		double bonot;
		double sueldo;
		double tiempo;
		System.out.println("Ingrese su tiempo trabajando en la empresa (en años)");
		tiempo = leer.nextDouble();
		System.out.println("ingrese su sueldo en pesos");
		sueldo = leer.nextDouble();
		if ((tiempo>4) | (sueldo<2000)) {
			bonot = sueldo*0.25;
		} else {
			bonot = sueldo*0.2;
		}
		System.out.println("su bono a recibir es: "+bonot);
                }
	}
        
        
        // TODO code application logic here
    }
    

