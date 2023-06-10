/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package archivos;

import java.io.File;

import java.io.FileWriter;
// Importo la clase FileWriter que me permite escribir un archivo

import java.io.IOException;
// Importo el objetoPrintwriter que me permite imprimir una salida de texto


import java.util.Scanner;

public class Archivos {

    public static void main(String[] args){
      File archivo = new File("Registros.txt");
         
      try {
         Scanner sc = new Scanner(System.in); 
          // Crear un objeto Scanner para leer la entrada del usuario

              FileWriter escribir = new FileWriter(archivo,true );
         // se aniade el parametro false para que el archivo se quede guardado
          
         System.out.println("Escriba el mensaje que irá dentro del archivo: ");
         String mensaje = sc.nextLine(); 
          // Leer el mensaje escrito por el usuario
         
         escribir.write(mensaje); // Escribir el mensaje en el archivo
         escribir.close(); // Cerrar el escritor
         System.out.println("El archivo ha sido creado y escrito "
                 + "correctamente.");
      } catch (IOException e) {
         System.out.println("Ha ocurrido un error al momento de crear "
                 + "o escribir en el archivo.");

      }

      try {
         Scanner entrada = new Scanner(archivo);
         while (entrada.hasNextLine()) {
            String linea = entrada.nextLine(); // Leer el texto del archivo
            System.out.println(linea); // Imprimir el texto del archivo
         }
         entrada.close(); // Cerrar el lector
      } catch (Exception e) {
         System.err.println("Ha ocurrido un error al momento de leer el archivo.");
      
      }
   }
}


