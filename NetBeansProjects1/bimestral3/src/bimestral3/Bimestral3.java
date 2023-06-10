package bimestral3;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * 
 */
public class Bimestral3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] meses = new int [12];
        int [] mesesdulc = new int [12];
        int [] mesesbeb = new int [12];
        for(int i=0;i<12;i++){
          meses[i]=i+1; 
          mesesdulc[i]=i+1;
          mesesbeb[i]=i+1;
        }
        double [] dulces = new double [12];
        double [] bebidas = new double [12];
        double [] conservas= new double [12];
        double [] dulcesor = new double [12];
        double [] bebidasor = new double [12];
        double [] agosto =new double [3];
        double [] agostoor =new double [3];
        System.out.println("Ingrese los costos de producción de: Dulces:");
        leer(dulces);
        System.out.println("Ingrese los costos de producción de: Bebidas:");
        leer(bebidas);
        System.out.println("Ingrese los costos de producción de: Conservas:");
        leer(conservas);
        agosto[0]=dulces[7];
        agosto[1]=bebidas[7];
        agosto[2]=conservas[7];
         mesesdulc=arreglar2(dulcesor,dulces,mesesdulc,meses);
        System.out.println("El mes en el que se registró mayor costo de producción de dulces");
        System.out.println("Fué en el mes nro: "+mesesdulc[0]);
        mesesbeb =arreglar2(bebidasor,bebidas,mesesbeb,meses);
        System.out.println("El mes en el que se registró menor costo de producción de bebidas");
        System.out.println("Fué en el mes nro: "+mesesbeb[11]);
        System.out.println("El promedio de producción de conservas, fué de: "+promedio (conservas) );
        agostoor=arreglar2(agostoor,agosto);
        System.out.println("El departamento que tuvo menor costo de producción en agosto fué: ");
        if (agostoor[2]==dulces[7]){
            System.out.println("Dulces, con: "+agostoor[2]); 
        }
          if (agostoor[1]==bebidas[7]){
            System.out.println("Bebidas, con: "+agostoor[2]); 
        }
            if (agostoor[0]==conservas[7]){
            System.out.println("Conservas, con: "+agostoor[2]); 
        }
    }
    public static void leer(double[]matriz){//método para leer
        Scanner entrada = new Scanner(System.in);
        for(int i=0;i<12;i++){
            matriz[i]=entrada.nextDouble();
        }   
    }
    public static void arreglar(double[]vectoror,double[]vector,int[] mesesor,int[] mesesn){//método para arreglar 
        vectoror=vector;
        for(int i=0;i<11;i++){
           for(int j=1;j<12;j++){ 
               if(vector[j]>vector[i]){
                vectoror[i]=vector[j]; 
                mesesor[i]=mesesn[j];  
               }
           }
        }   
    }
    public static double[] arreglar2(double[]vectoror,double[]vector){//método para arreglar
        vectoror=vector;
        for(int i=0;i<2;i++){
           for(int j=1;j<3;j++){ 
               if(vector[j]>vector[i]){
                vectoror[i]=vector[j];   
               }
           }
        }
      return vectoror; 
    } 
    public static double promedio (double[] vector){//método para calcular el promedio 
        double ac,prom;
        ac=0;
        
        for(int i=0;i<12;i++){
           ac=ac+vector[i]; 
        }
        prom=ac/12;
        return prom;
    }
    public static int [] arreglar2(double[]vectoror,double[]vector,int[] mesesor,int[] mesesn){//método para arreglar
        vectoror=vector;
        for(int i=0;i<11;i++){
           for(int j=1;j<12;j++){ 
               if(vector[j]>vector[i]){
                vectoror[i]=vector[j]; 
                mesesor[i]=mesesn[j];  
               }
    
           }
       
        }
       return mesesor;
    }
   
}
