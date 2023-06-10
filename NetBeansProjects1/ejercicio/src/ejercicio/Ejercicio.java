package ejercicio;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author UTPL
 */
public class Ejercicio {

	/**
 	* @param args the command line arguments
 	*/
	public static void main(String[] args) {
    	Scanner entrada = new Scanner(System.in);

    	System.out.println("Ingrese la dimensión del arreglo: ");
    	int n = entrada.nextInt();
    	int[] arreglo = new int[n];
   	 
    	System.out.println("Ingrese los valores del arreglo: ");
    	for (int i = 0; i < n; i++) {
        	arreglo[i] = entrada.nextInt();
    	}
   	 
    	inv(arreglo);
    	
        orden(arreglo);
    	
    	// TODO code application logic here
	}

	public static void inv(int [] arreglo) {
    	System.out.println("Vector al revés: ");
    	for (int i = arreglo.length-1; i>=0; i = i - 1) {

        	System.out.println(arreglo[i]);

    	}
	}


        public static void orden(int [] arreglo) {
        int ea;
        int es;
        for(int x=0;x<arreglo.length;x++){
         for(int y=0;y<arreglo.length-1;y++){
         ea=arreglo[y];
         es=arreglo[y+1];
         if (ea>es){
         arreglo[y]=es;
         arreglo[y+1]=ea;
         }
         }
       } 
            System.out.println("Vector ordenado");
            for (int i = 0; i<arreglo.length; i = i + 1)
                System.out.println(arreglo[i]);
            
        } 
        }