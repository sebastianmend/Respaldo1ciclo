package ejercicio11bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Ejercicio11bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
		int n_dia;
		System.out.println("ingrese un número del 1 al 7");
		n_dia = leer.nextInt();
		switch (n_dia) {
		case 1:
			System.out.println("el día que corresponde es lunes");
			break;
		case 2:
			System.out.println("el día que corresponde es martes");
			break;
		case 3:
			System.out.println("el día que corresponde es miércoles");
			break;
		case 4:
			System.out.println("el día que corresponde es jueves");
			break;
		case 5:
			System.out.println("el día que corresponde es viernes");
			break;
		case 6:
			System.out.println("el día que corresponde es sábado");
			break;
		case 7:
			System.out.println("el día que corresponde es domingo");
			break;
		default:
			System.out.println("el número debe ser del 1 al 7");
		}
    }  
        // TODO code application logic here
    }  
}
