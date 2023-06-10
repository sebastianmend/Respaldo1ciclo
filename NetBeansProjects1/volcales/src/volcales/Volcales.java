/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volcales;
import java.util.Scanner;
/**
 *
 * @author sebas
 */
public class Volcales {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        String cad;
        int i, contv, contc;
        contv=0;
        contc=0;       
        System.out.println("Ingrese la palabra: ");
        cad = leer.next();
        cad=EliminaEspacios(cad);
        for(i=0;i<cad.length();i++){
            if((cad.charAt(i)=='a')||(cad.charAt(i)=='e')||(cad.charAt(i)=='i')||
               (cad.charAt(i)=='o')||(cad.charAt(i)=='u')) {
                contv++;
                
            }else {
               contc++; 
                
            }
            
            
            
        }
        System.out.println("vocales:"+contv);
        System.out.println("consonantes:"+contc);
        
        
        // TODO code application logic here
    }
    public static String EliminaEspacios(String cad){
        return cad.replace(" ", "");
        
    }
}
