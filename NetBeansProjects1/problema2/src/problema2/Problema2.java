package problema2;
import java.util.Scanner;//el programa ocupa el tipo scanner
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);{
        //se inicia el tipo scanner y se da el nombre de 
        //cuando querramos que lea
        
         int mes;//escribimos la variable mes que es la que necesitamos
         
         System.out.println("ingrese un número del 1 al 12 para especificar el mes");
          mes=leer.nextInt();
          
             switch(mes){
                 case 1:
                     System.out.println("enero tiene 31 días ");
                     break;
                 case 2:    
                     System.out.println("Febrero tiene 28 días"); 
                     break;
                 case 3:    
                     System.out.println("Marzo tiene 31 días"); 
                     break;
                 case 4:
                     System.out.println("Abril tiene 30 días ");
                     break;
                 case 5:    
                     System.out.println("Mayo tiene 31 días");  
                     break;
                 case 6 :    
                     System.out.println("Junio tiene 30 días");
                     break;
                 case 7:
                     System.out.println("Julio tiene 31 días ");
                     break;
                 case 8:    
                     System.out.println("Agosto tiene 31 días");
                     break;
                 case 9:    
                     System.out.println("Septiembre tiene 30 días"); 
                     break;
                 case 10:
                     System.out.println("Octubre tiene 31 días ");
                     break;
                 case 11:    
                     System.out.println("Noviembre tiene 30 días"); 
                     break;
                 case 12:    
                     System.out.println("Diciembre tiene 31 días"); 
                     break;  
                 default:
                     System.out.println("el número debe ser entre 1 y 12");      
             }
        
        
         }    
        // TODO code application logic here
    }
    
}
