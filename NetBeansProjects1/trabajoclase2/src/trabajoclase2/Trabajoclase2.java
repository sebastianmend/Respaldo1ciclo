package trabajoclase2;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author UTPL
 */
public class Trabajoclase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int f, c;
        
        System.out.println("¿Cuántas filas tienen las matrices?");
        f=entrada.nextInt();
        
        System.out.println("¿Cuántas columnas tienen las matrices?");
        c=entrada.nextInt();
        
        int m1[][]=new int [f][c];
        int m2[][]=new int [f][c];
        int rta[][]=new int [f][c];
        
        System.out.println("Ingrese valores de la matriz 1: ");
        leer(m1,f,c);
        
        System.out.println("Ingrese valores de la matriz 2: ");
        leer(m2,f,c);
        
        
        for(int i=0;i<f;i++){
            for(int j=0;j<c;j++){
            rta[i][j]=m1[i][j]+m2[i][j]; 
    
            } 
        }
        
        System.out.println("La matriz 1 es: ");
        most(m1,f,c);
        
        System.out.println("La matriz 2 es: ");
        most(m2,f,c);
        
        System.out.println("La matriz resultante es: ");
        most(rta,f,c);
        
      
        
        // TODO code application logic here
    }
    
   public static void leer(int[][]matriz,int f, int c){ 
    Scanner entrada = new Scanner(System.in);
       System.out.println("Ingrese los valores, filas por filas");
       for(int i=0;i<f;i++){
         for (int j=0;j<c;j++){
             matriz[i][j]=entrada.nextInt();
   
         }
       }    
   }
   
   
     public static void most(int[][]matriz,int f,int c){
      for(int i=0;i<f;i++){
         for (int j=0;j<c;j++){
             System.out.print("["+matriz[i][j]+"]");
             
         }
          System.out.println("");
      }
  
    }

   
}
