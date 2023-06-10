package factorial;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author UTPL
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
        
        int num, fact, i;
        fact=1;         
        System.out.println("ingrese el número a calcular el factorial");
        num=leer.nextInt();
        
        if(num==0){
            System.out.println("el número debe ser mayor a 0");
        }        
        for( i=1; i<=num; i++)
        {
            fact=fact*i;
            
        }
        System.out.println(fact);
              
        
    } 
        // TODO code application logic here
    }
    
}