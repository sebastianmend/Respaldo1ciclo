package repasoexcepciones;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Repasoexcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);   
        int num=0;
        System.out.println("Raiz cuadrada de un número");
        boolean datoValido=false;
        while(!datoValido){
            try{
                System.out.println("Ingrese un número entero positivo: ");
                num=Integer.parseInt(entrada.nextLine());
                if(num<0){
                    throw new Exception ("Número no positivo");
                }
                datoValido=true;  
            } catch(Exception e){
                System.out.println("\nDato no válido");         
            }
        }
        System.out.println("\nRaiz cuadrada: "+Math.sqrt(num));  
    }   
}
