package repaso2;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Repaso2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);{ 
     
        double h_sen, h_dobl, h_trip, cant_sen, cant_dobl, cant_tripl, p_total, t_pago;
         
        System.out.println("escriba 1 si el pago es con efectivo y 2 si el pago es con tarjeta");
        t_pago=leer.nextDouble();
        
        h_sen=5;
        h_dobl=8;
        h_trip=12;
        
        
        System.out.println("¿Cuántas hamburguesas sencillas consumió?");
        cant_sen=leer.nextDouble();
        
        System.out.println("¿Cuántas hamburguesas dobles consumió?");
        cant_dobl=leer.nextDouble();
        
        System.out.println("¿Cuántas hamburguesas triples consumió?");
        cant_tripl=leer.nextDouble();
        
        
         p_total= ((h_sen*cant_sen)+(h_dobl*cant_dobl)+( h_trip*cant_tripl));
        
        if (t_pago==2 ){
            
            p_total=p_total+(p_total*0.1);
            System.out.printf("el total a pagar es: $%s%n", p_total);
            
        }else 
            System.out.printf("el total a pagar es: $$%s%n", p_total);
 
     }   
        // TODO code application logic here
    }
    
}
