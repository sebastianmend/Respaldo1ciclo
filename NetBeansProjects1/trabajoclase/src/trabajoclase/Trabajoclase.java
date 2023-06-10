package trabajoclase;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Trabajoclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un número");
        int n = entrada.nextInt();
        System.out.println("EL valor absoluto es:");
        System.out.println(Math.abs(n));
        System.out.println("");
        
        System.out.println("El logaritmo natural (base e) es: ");
        System.out.println(Math.log(n));
        System.out.println("");
        
        System.out.println("El seno trigonométrico es: ");
        System.out.println(Math.sin(n));
        System.out.println("");
        
        System.out.println("El coseno trigonométrico es: ");
        System.out.println(Math.cos(n));
        System.out.println("");
        
        System.out.println("Tangente trigonométrica es: ");
        System.out.println(Math.tan(n));
        System.out.println("");
        
        System.out.println("La raiz cuadrada es: ");
        System.out.println(Math.sqrt(n));
        
        System.out.println("Ingrese un parámetro");
        int x = entrada.nextInt();
        
        System.out.println("Ingrese un parámetros");
        int y = entrada.nextInt();
        
        System.out.println("El valor más grande de los dos, es: ");
        System.out.println(Math.max(x, y));
        System.out.println("");
        
        System.out.println("El valor más pequeño de los dos, es: ");
        System.out.println(Math.min(x, y));
        System.out.println("");
        
        System.out.println("El primer valor, elevado al segundo, es: ");
        System.out.println(Math.pow(x, y));
        System.out.println("");
        
  
    }
    
}
