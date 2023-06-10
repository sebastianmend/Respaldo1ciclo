package mayorcero;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author UTPL
 */
public class Mayorcero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
        int n, i, cant, resul1, resul2;
        resul1=0;
        resul2=0;
        System.out.println("la cantidad de números que va a ingresar ");
        cant=leer.nextInt();
        
        for (i=1;i<=cant;i=i+1){
            
        
            System.out.println("la cantidad del número ");
            n=leer.nextInt();
            
            if(n>=0){
                resul1=resul1+1;
               
            }else{
                
                resul2=resul2+1;
            }
     }
        System.out.printf("los números mayores a 0 son: %s%n",+resul1);
        System.out.printf("los números menores a 0 son: %s%n",+resul2);
    }
        
        // TODO code application logic here
    }
    
}
