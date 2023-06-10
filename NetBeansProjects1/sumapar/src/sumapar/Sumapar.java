package sumapar;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Sumapar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
      int n, resul, i;
      resul=0;
      System.out.print ("Ingrese el número a verificar: ");
      n = leer.nextInt ();
         if ((n>2)&&(n % 2 == 0))
         {
          for(i=0;i<=n ; i=i+2 ) {  
             resul=resul+i;
             }
             System.out.printf("El resultado es: %s%n", resul);
          
         }else{
             
             System.out.println("El número ingresado debe ser mayor a 2");  
         }    
         }       
        // TODO code application logic here
    }
    

