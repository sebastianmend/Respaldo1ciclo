package velocidad;

import java.util.Scanner;

/*determinar la distancia en metros de un vehículo que se desplaza a velocidad constante por un determinado tiempo 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Velocidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
      Scanner leer=new Scanner(System.in);
      
      double v,t,d;
      System.out.println("Programa que permite calcular la distancia de un vehículo que se desplaza a velocidad constante por un determinado tiempo ");
      
      System.out.println("ingrese la velocidad en m/s");
     v=leer.nextDouble();
     
     System.out.println("ingrese el tiempo en segundos");
     t=leer.nextDouble();
      
     d=v*t;
     
          System.out.printf("la distancia recorrida por el vehículo es de:%.2fm\n", d);
          

// TODO code application logic here
    }
    
}
