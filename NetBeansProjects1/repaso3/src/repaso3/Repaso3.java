package repaso3;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Repaso3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{ 
  
        double anios,  i, c, mont, total_an, total;
                
        System.out.println("Ingrese el número de años");
        anios=leer.nextDouble();
        total_an=0;
        total=0;
        for(i=0;i<anios; i++){
            for(c=1;c<=12; c++){
                 System.out.println("Ingrese el monto");  
                 mont=leer.nextDouble();
                 
                 total_an=total_an + mont;
  
            }
            
         total=total_an+(total_an*0.1);
         System.out.printf("Su total  en el año es: $ %s%n", total);
    
        }
  
     }        
// TODO code application logic here
    }
    
}
