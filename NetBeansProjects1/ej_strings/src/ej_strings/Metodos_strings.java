/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej_strings;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
class Metodos_strings {
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
        
        
     }   // TODO code application logic here
    
    
    
    
    

