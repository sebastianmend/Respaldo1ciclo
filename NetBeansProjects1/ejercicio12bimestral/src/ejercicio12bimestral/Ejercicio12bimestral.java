package ejercicio12bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Ejercicio12bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
		int num;
		System.out.println("ingrese un número del 1 al 10");
		num = leer.nextInt();
		switch (num) {
		case 1:
			System.out.println("el número es: I ");
			break;
		case 2:
			System.out.println("el número es: II");
			break;
		case 3:
			System.out.println("el número es: III");
			break;
		case 4:
			System.out.println("el número es: IV ");
			break;
		case 5:
			System.out.println("el número es: V");
			break;
		case 6:
			System.out.println("el número es: VI ");
			break;
		case 7:
			System.out.println("el número es: VII");
			break;
		case 8:
			System.out.println("el número es: VIII");
			break;
		case 9:
			System.out.println("el número es: IX ");
			break;
		case 10:
			System.out.println("el número es: X");
			break;
		default:
			System.out.println("el número debe ser del 1 al 10");
		}
}
        // TODO code application logic here
    }    
}
