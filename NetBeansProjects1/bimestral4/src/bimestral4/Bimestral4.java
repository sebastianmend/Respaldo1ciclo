package bimestral4;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * 
 */
public class Bimestral4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
        int al;
        System.out.println("Ingrese el número de alumnos ");
        al= entrada.nextInt();
        String [] nom = new String [al];
        double [] nota = new double [al];
        String [] result = new String [al];
        System.out.println("Ingrese el nombre de los alumnos: ");
        leers(nom,al);
        System.out.println("Ingrese la nota de los alumnos: ");
        leer(nota,al);
        
        for(int i=0;i<al;i++){
            if((nota[i]>=0)&&(nota[i]<5)){
               result[i]="SUSPENSO";   
            }
            if((nota[i]>=5)&&(nota[i]<7)){
                result[i]="BIEN"; 
            }
            
            if((nota[i]>=7)&&(nota[i]<9)){
                result[i]="NOTABLE "; 
            }
            if((nota[i]>=9)&&(nota[i]<=10)){
                result[i]="SOBRESALIENTE"; 
            }
        }
        most(nom,nota,result,al);
    }
    public static void leers(String[]matriz, int al){//método para leer 
        Scanner entrada = new Scanner(System.in); 
        int n;
        n=al;
        for(int i=0;i<n;i++){
             matriz[i]=entrada.next();
        }  
    }
    public static void leer(double[]matriz, int al){//método para leer
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<al;i++){
            matriz[i]=entrada.nextDouble();
            if((matriz[i]<0)||(matriz[i]>10)){
                System.out.println("Debe ingresar un número del 1 al 10, intente de nuevo por favor");  //si 
                //el número es ino incompatible, muestra este mensaje 
            i=i-1;    
            }
        } 
    }
    public static void most(String[]nom,double[] nota,String[]result,int al ){
        for(int i=0;i<al;i++){
        System.out.println(nom[i]+"  🡪  "+nota[i]+"  🡪  "+result[i]); 
         }
    }
   
}

