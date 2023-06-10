package triangulos;

import java.util.Scanner;

public class Triangulos {

    public static void main(String[] args) {
        
        Scanner leer=new Scanner(System.in);
        double l_1, l_2, l_3, l_m;
        
           l_m=0; 
                   
          System.out.println("Programa para identificar si 3 medidas pueden"
                     + "formar un triángulo y qué tipo de triángulo sería");
          
            System.out.println("Ingrese el primer lado");
                l_1=leer.nextDouble(); 
                
            System.out.println("Ingrese el segundo lado");    
                 l_2=leer.nextDouble();
                 
            System.out.println("Ingrese el tercer lado");
                 l_3=leer.nextDouble();
                 
            if(l_1>l_2){
                if(l_1>l_3) {
                    l_m=l_1;
                    if(l_2+l_3>l_m){
                        
                        }else{
                        if((l_m==l_2)&&(l_m==l_3)&&(l_2==l_3)){
                            System.out.println("El triangulo es equilatero");
                         }else if ((l_m==l_2)||(l_2==l_3)||(l_3==l_m)){
                                 System.out.println("El trianuglo es isósceles");   
                              }else{
                                System.out.println("El triangulo es escaleno");
                               }
                            }   
                        }
                    }else{ 
                        l_m=l_3;
                        if(l_1+l_2>l_m){
                            
                          if((l_1==l_2)&&(l_1==l_m)&&(l_2==l_m)){
                           System.out.println("El triangulo es equilatero");
                          }else{
                            if((l_1==l_2)||(l_2==l_m)||(l_m==l_1)){
                        System.out.println("El triangulo es isósceles");
                            }else{
                            System.out.println("El triangulo es escaleno");        
                                 }   
                     }
                            }else{
                            l_m=l_2;
                               if(l_3+l_1>l_m){
                                   
                                    if((l_1==l_m)&&(l_1==l_3)&&(l_m==l_3)){
                                    System.out.println("El triangulo es equilatero");
                                }else{
                                   if((l_1==l_m)||(l_m==l_3)||(l_3==l_1)){
                                   System.out.println("El trianuglo es isósceles");
                                     }else{
                                             System.out.println("El triangulo es escaleno");    
                                }
                       }  
           
                    } 
                }            
        
            }
        }
    }
