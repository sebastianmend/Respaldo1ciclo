package dowile;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Dowile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n,i, rta;
        System.out.println("-----Programa para saber la tabla de multiplicar-----");
        System.out.println("Ingrese un número entero: ");
        n=entrada.nextInt();
        i=1;
        do{
            rta=n*i;
            System.out.print(n+"*"+i+"="+rta/n);
            System.out.println("");
            i++;
        }while(i<=12);

    }
    
}
