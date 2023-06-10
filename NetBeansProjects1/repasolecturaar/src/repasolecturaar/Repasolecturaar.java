package repasolecturaar;
import java.io.*;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Repasolecturaar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
         File archivo=new File("data/Personas.txt");   
         Scanner f =new Scanner (archivo);
         String[] persona;
         ArrayList<String> nombres=new ArrayList();
         ArrayList<String> generos=new ArrayList();
         ArrayList<Integer> edades=new ArrayList();
         while (f.hasNextLine()){
            persona=f.nextLine().split(",");
            nombres.add(persona[0]);
            generos.add(persona[1]);
            edades.add(Integer.parseInt(persona[2]));
        }
         f.close();
         int suma=0;
         for(int i=0;i<=edades.size()-1;i++){
             suma+=edades.get(i);
         }
         double media=(double)suma/edades.size();
            System.out.println("Promedio: "+media);
        }catch(Exception e){
            System.out.println("ERROR: "+e.getMessage());
        }
        
        // TODO code application logic here
    }
    
}
