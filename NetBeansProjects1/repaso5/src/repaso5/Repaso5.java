package repaso5;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Repaso5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);{ 
                int n;
		int perfecto;
		int x;
		System.out.println("Ingresa un numero");
		n = leer.nextInt();
		x = 2;
		perfecto = 0;
		while (x<=n) {
			if (n%x==0) {
				perfecto = perfecto+(n/x);
			}
			x = x+1;
		}
		if (perfecto==n) {
			System.out.println("El numero "+n+" es un numero perfecto");
		} else {
			System.out.println("Elnumero "+n+" no es un numero ferfecto");
		}
        
        
        
     }   
        // TODO code application logic here
    }
    
}
