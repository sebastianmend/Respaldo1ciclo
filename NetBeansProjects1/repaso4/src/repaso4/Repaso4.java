package repaso4;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Repaso4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
        int[] arreglo = new int[10];
        
        for(int i=0; i<10; i++ ){
          System.out.println("ingrese el valor del arreglo");
          arreglo[i]=leer.nextInt();
          }
        for(int contador=0;contador<arreglo.length;contador++){
           System.out.printf("%5d%8d%n", contador, arreglo[contador]);  
        }
    } 
        // TODO code application logic here
    }
    
}
