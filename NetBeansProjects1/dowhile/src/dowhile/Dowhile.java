package dowhile;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author sebas
 */
public class Dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int anio;
            do{
               System.out.println("Ingrese un año");
                anio=leer.nextInt();      
            }while(anio<2022);
            System.out.println("Usted llegó o sobrepasó el año en curso");  
        // TODO code application logic here
    }   
}
