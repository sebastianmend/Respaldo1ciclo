package metodos_strings;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Metodos_strings {
    
        Scanner entrada;
        public Metodos_strings(){
          this.entrada=new Scanner(System.in);  
            
        }
        public int menu(){
            System.out.println("Presentar caracter por caracter [1]:");  
            System.out.println("Salir [0]");
            return entrada.nextInt();   
        }
        public void carxcar(){
          String cadena="";
          entrada.nextLine();
            System.out.println("digite una cadena: ");
            cadena= entrada.nextLine();
            System.out.println("");
            for(int i=0;i<cadena.length();i++){
                System.out.println(cadena.charAt(i));  
                
                
            }
            
        }
        
        public String eliminaEspacios(string cad){
            
        
        
    }
        
        public void palindromo (){
         int j;   
         boolean noes=false 
         String cadena="",cad=""        
         entrada.nextLine();   
            System.out.println("Digite una cadena de caracteres: ");   
            
            
        }
        
        // TODO code application logic here
    
    
}
