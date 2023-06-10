package ejercicio14bimestral;
import java.util.Scanner;
 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Ejercicio14bimestral {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
		int num;
		System.out.println("ingrese el número del 1 al 9");
		num = leer.nextInt();
		switch (num) {
		case 1:
			System.out.println("la letra es: A ");
			break;
		case 2:
			System.out.println("la letra es: B ");
			break;
		case 3:
			System.out.println("la letra es: C");
			break;
		case 4:
			System.out.println("la letra es: D ");
			break;
		case 5:
			System.out.println("la letra es: E");
			break;
		case 6:
			System.out.println("la letra es: F");
			break;
		case 7:
			System.out.println("la letra es: G");
			break;
		case 8:
			System.out.println("la letra es: H");
			break;
		case 9:
			System.out.println("la letra es: I");
			break;
		default:
			System.out.println("el número debe ser del 1 al 9");
		}
	}
     // TODO code application logic here
    }  
}
