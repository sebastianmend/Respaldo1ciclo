package proyecto;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);{
        
        double valor_polizaa, valor_polizab, carga_alc, carga_lent, carga_enf,carga_edad, total, edad, alcohol, lentes, enfermedad, poliza ;
        
        
        valor_polizaa=1200;
        valor_polizab=950;
        carga_alc=0;
        carga_lent=0;
        carga_enf=0;   
        carga_edad=0;        
                
        System.out.println("ingrese el tipo de póliza que desea, si desea A ingrese 1 o ingrese 2 si desea B");
                poliza=leer.nextDouble();
                
        System.out.println("ingrese su edad");
            edad=leer.nextDouble();
            
        System.out.println("¿Posee usted alguna enfermedad?(ingrese 1 si sí posee y 0 si no posee)");  
            enfermedad=leer.nextDouble();
            
        System.out.println("¿Usa usted lentes?(ingrese 1 si sí posee y 0 si no posee)");  
            lentes=leer.nextDouble();
            
        System.out.println("¿Suele ingerir alcohol?(ingrese 1 si sí posee y 0 si no posee)");   
             alcohol=leer.nextDouble();        
        
        if (poliza==1){
            if(alcohol==1) {
             carga_alc=valor_polizaa*0.1;
           }
            if(lentes==1){
             carga_lent=valor_polizaa*0.05;
            }
            if (enfermedad==1){
             carga_enf=valor_polizaa*0.05;
            }
            if (edad>40){
                carga_edad=valor_polizaa*0.2;
            }    
            if (edad<=40){
                carga_edad=valor_polizaa*0.1;  
            }
            total=carga_alc+ carga_lent+ carga_enf+ carga_edad+valor_polizaa;
            System.out.printf("su total a pagar es %f%n ", total );
            }else 
            {
            if(alcohol==1) {
             carga_alc=valor_polizab*0.1;
           }
            if(lentes==1){
             carga_lent=valor_polizab*0.05;
            }
            if (enfermedad==1){
             carga_enf=valor_polizab*0.05;
            }
            if (edad>40){
                carga_edad=valor_polizab*0.2;
            }    
            if (edad<=40){
                carga_edad=valor_polizab*0.1;  
            }
            total=carga_alc+ carga_lent+ carga_enf+ carga_edad+valor_polizab;
            }
            System.out.printf("su total a pagar es %f%n ", total );
        
        
        }
        
        
        }
        
   
}



