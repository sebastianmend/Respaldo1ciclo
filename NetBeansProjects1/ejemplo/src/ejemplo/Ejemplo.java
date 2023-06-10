package ejemplo;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el número de filas: ");
        int n = entrada.nextInt();
        System.out.println("Ingrese el número de columnas: ");
        int m = entrada.nextInt();
        int[][] matriz = new int[n][m];
        
        System.out.println("Ingrese los valores del arreglo: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = entrada.nextInt();
            }
        }
        
        inv(matriz,n,m);
        alrc(matriz,n,m);
        alrf(matriz,n,m);
        alrt(matriz,n,m);
        
    }

    public static void inv(int [][] matriz,int n,int m) {
        System.out.println("Matriz: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("["+matriz[i][j]+"]");
                if (j==m-1)
                    System.out.println("");
            }
        }
    }
    
    public static void alrc(int [][] matriz,int n,int m) {
        System.out.println("Matriz columnas invertidas: ");
        for (int i = 0; i < n; i++) {
            for (int j = m-1; j>=0; j=j-1) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
    
    public static void alrf(int [][] matriz,int n,int m) {
        System.out.println("Matriz filas invertidas: ");
        for (int i = n-1; i >= 0; i=i-1) {
            for (int j = 0; j < m; j++) {
            System.out.print("["+matriz[i][j]+"]");
                
            }
            System.out.println("");
        }
    }
    
    public static void alrt(int [][] matriz,int n,int m) {
        System.out.println("Matriz filas y columnas invertidas: ");
        for (int i = n-1; i >= 0; i=i-1) {
            for (int j = m-1; j>=0; j=j-1) {
                System.out.print("["+matriz[i][j]+"]");
                
            }
            System.out.println("");
        }
    }
} 
        
        
        
        
        
        
       
    
