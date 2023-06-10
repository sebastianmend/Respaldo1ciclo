package trabajo;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Trabajo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
        String[] nombre = new String [10]; 
        String[] apellido = new String [10];
        String[] na = new String [10];
        
        
       
        for(int i=0; i<10; i++ ){
            
        
          System.out.println("Ingrese el nombre:");
          
          nombre[i]=leer.next();
          
          System.out.println("Ingrese el apellido:");
          
          apellido[i]=leer.next(); 
          
          na[i] = String.join(" ", nombre[i]) + " " + String.join(" ", apellido[i]);
         }         
         
        
        for(int i=1; i<=10; i++ ){
           
           System.out.printf("%5s%18s%n",i, na[i-1]);
            
           
        }
        
    }
        // TODO code application logic here
    }
    
}
