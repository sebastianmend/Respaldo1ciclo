package sumafracc;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Sumafracc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     double result, i;  
     result=0;
          for( i=1;(i<=100);i=i+1){
          result=result+1/i ;
           
           
           
         }
         System.out.printf("La respusta es: %f%n", +result);
        
        // TODO code application logic here
    }
    
}
