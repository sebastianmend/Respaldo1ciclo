package problema4;
import java.util.Scanner;//el programa ocupa el tipo scanner
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);{
        double cant, i, valor, mayor1000, mayor500, menor500, total;
        mayor1000=0;
        mayor500=0;
        menor500=0;
        System.out.println("¿Cuántas cantidades va a ingresar?");
        cant=leer.nextDouble();
        
        for(i=1;i<=cant;i++){

            System.out.println("Ingrese el valor: ");
             valor=leer.nextDouble();  
          if(valor>1000) { 
              mayor1000=mayor1000+valor;   
          }
          if((valor>500)&(valor<=1000)) { 
              mayor500=mayor500+valor;    
          }
          if(valor<=500) { 
              menor500=menor500+valor; 
          }  
         // TODO code application logic here
          }
        System.out.printf("el total vendido mayor a 1000 fué de: %f%n", mayor1000 );
        System.out.printf("el total vendido mayor a 500 fué de: %f%n", mayor500 );
        System.out.printf("el total vendido mernor o igual a 500 fué de: %f%n", menor500 );
        total=mayor1000+mayor500+menor500;
        System.out.printf("el total vendido fué de: %f%n",total );    
}

}
}

