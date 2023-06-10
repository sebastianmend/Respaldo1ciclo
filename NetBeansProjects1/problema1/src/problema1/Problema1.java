package problema1;
import java.util.Scanner;//el programa ocupa el tipo scanner 
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{//se inicia el tipo scanner y se da el nombre de 
        //cuando querramos que lea
        double alumn; //esta variable indica el número de alumnos
        double p_alumn; // esta variable indica el total a pagar por cada alumno 
        double p_total; //esta variable indica el total a la compañía de autobuses 
          System.out.println("Ingrese el número de alumnos ");
           alumn=leer.nextDouble();
         //dependiendo a las especificaciones del problema, procedemos a usar condicionales   
        if(alumn>=100){  
            p_alumn=5;
            p_total= alumn*p_alumn;
              System.out.printf("el total a pagar por cada alumno es: $%,.2f%n", +p_alumn);
              System.out.printf("El total a pagar a la compañía de autobuses es: $%,.2f%n", +p_total);
        }
        
        if((alumn>=50)&(alumn<=99)){
            p_alumn=7;
            p_total= alumn*p_alumn;
              System.out.printf("el total a pagar por cada alumno es: $%,.2f%n", +p_alumn);
              System.out.printf("El total a pagar a la compañía de autobuses es: $%,.2f%n", +p_total); 
        }
        
        if((alumn>=30)&(alumn<=49)){
            p_alumn=10;
            p_total= alumn*p_alumn;
              System.out.printf("el total a pagar por cada alumno es: $%,.2f%n", +p_alumn);
              System.out.printf("El total a pagar a la compañía de autobuses es: $%,.2f%n", +p_total); 
        }
        if(alumn<30){
            p_total=300;
            p_alumn=p_total/alumn;
              System.out.printf("el total a pagar por cada alumno es: $%,.2f%n", +p_alumn);
              System.out.printf("El total a pagar a la compañía de autobuses es: %,.2f%n", +p_total); 
        }
        
        }
        
        // TODO code application logic here
    }
}    

