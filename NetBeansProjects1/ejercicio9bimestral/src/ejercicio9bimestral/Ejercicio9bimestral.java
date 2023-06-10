package ejercicio9bimestral;
import java.util.Scanner;
 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Ejercicio9bimestral {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
		double edad;
		double promedio;
		System.out.println("ingrese su edad");
		edad = leer.nextDouble();
		System.out.println("ingrese su promedio");
		promedio = leer.nextDouble();
		if ((edad>18) && (promedio>=9)) {
			System.out.println("Su beca será de $2000.00");
		}
		if ((edad>18) && (promedio>=7.5) && (promedio<9)) {
			System.out.println("Su beca será de $1000.00");
		}
		if ((edad>18) && (promedio<7.5) && (promedio>=6)) {
			System.out.println("Su beca será de $500.00");
		}
		if ((edad>18) && (promedio<6)) {
			System.out.println("se le invita a estudiar más el próximo año");
		}
		if ((edad<=18) && (promedio>=9)) {
			System.out.println("Su beca será de $3000.00");
		}
		if ((edad<=18) && (promedio>=8) && (promedio<9)) {
			System.out.println("Su beca será de $2000.00");
		}
		if ((edad<=18) && (promedio<8) && (promedio>=6)) {
			System.out.println("Su beca será de $100.00");
		}
		if ((edad<=18) && (promedio<6)) {
			System.out.println("se le invita a estudiar más el próximo año");
		}     
     }
    // TODO code application logic here
    } 
}
