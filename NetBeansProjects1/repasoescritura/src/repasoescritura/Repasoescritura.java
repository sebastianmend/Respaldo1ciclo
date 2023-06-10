package repasoescritura;
import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Repasoescritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            FileWriter salida =new FileWriter("Nombres.txt");
            PrintWriter pw= new PrintWriter(salida);
            String nombre1="Daniela Monserrat";
            String nombre2="Demy Carolina";
            pw.println(nombre1);
            pw.println(nombre2);
            pw.close();
        }catch(Exception e){
            System.err.println("ERROR:\n"+e.getMessage());
        }
    }  
}
