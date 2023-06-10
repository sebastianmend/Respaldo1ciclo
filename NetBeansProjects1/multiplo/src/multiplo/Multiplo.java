package multiplo;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author UTPL
 */
public class Multiplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
        int resul,num;
        System.out.println("ingrese el número del que quiere saber los múltiplos");
        num=leer.nextInt();
        
        
        resul=0;
                
        for(int x=num;(x<=100);x=x+num){
           
            
            System.out.println("el número es "+ x);
            
            resul=resul+1;
        }
        System.out.printf("el número de múltiplos son: %s%n", +resul);
        
    }    
        // TODO code application logic here
    }
    
}
