package estudiomatrices;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Estudiomatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
            
         int i, x, d, p, c;
         double aux, ac;
         String auxc;       
          
         System.out.println("Ingrese la cantidad de parroquias: ");
         p=leer.nextInt(); 
          
         System.out.println("Ingrese la cantidad de candidatos: ");
         c=leer.nextInt(); 
         
         double votos[][]= new double[p][c];
         String candid []= new String [c];
         double totalv[]= new double[c]; 
        
         for(i=0;i<c;i++){
             System.out.println("Ingrese el nombre del candidato "+i);
             candid[i]=leer.next(); 
         }       
         d=0;
         ac=0;
         for(i=0;i<c;i++){
             System.out.println("Ingrese los valores del candidato "+i);  
             for(x=0;i<x;x++){
                 votos[c][p]=leer.nextDouble();
                 ac=ac+votos[c][p];    
             }
             totalv[i]=ac;
             
             if(totalv[i]>=50){
                 System.out.println("El candidato: "+candid[i]+" es declarado ganador");
                 d=80;
             }
     }
         for(i=0;i<c;i++){
          for(x=2;x<=c;x++){
              if(totalv[x]>totalv[i]){
                  
                  aux=totalv[i];
                  auxc=candid[i];
                  totalv[i]=totalv[x];
                  candid[i]=candid[x];
                  totalv[x]=aux;
                  candid[x]=auxc;
              }
              
              
          }   
             
         }
         if(d=0){
             System.out.println("La segunda vuelta se dará entre: "+candid[1]+" con: "+totalv[1]+" de votos");
             System.out.println("contra:");
             System.out.println(candid[2]+"con: "+totalv[2]+" de votos");
         }
         
         
    }
        // TODO code application logic here
    }
    
}
