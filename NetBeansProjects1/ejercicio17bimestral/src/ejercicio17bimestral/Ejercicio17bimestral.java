package ejercicio17bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicio17bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer=new Scanner(System.in);
        
		double n;
		double rta;
		double x;
		System.out.println("Ingrese un número par aparte del 2");
		n =  leer.nextDouble();
		rta = 0;
		if ((n==2)) {
			System.out.println("Ingrese un número par, que no sea 2");
		} else {
			if ((n%2==0)) {
				for (x=2;x<=n;x+=2) {
					rta = rta+x;
				}
				System.out.println("la suma es: "+rta);
			} else {
				System.out.println("el número debe ser par");
			}
		}
	
        // TODO code application logic here
    }
    
}
