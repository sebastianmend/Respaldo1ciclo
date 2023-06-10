package ejercicomatriz;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicomatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de filas: ");
        int f = entrada.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        int c = entrada.nextInt();
        int[][] arreglo = new int[f][c];
        
        System.out.println("Ingrese los valores del arreglo: ");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                arreglo[i][j] = entrada.nextInt();
            }
        }
        inv(arreglo,f,c);
        
    }

    public static void inv(int [][] arreglo,int f,int c) {
        System.out.println("Matriz: ");
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("{"+arreglo[i][j]+"}");
                  if (j==c-1)
                    System.out.println("");
            }
        }
    }
}
