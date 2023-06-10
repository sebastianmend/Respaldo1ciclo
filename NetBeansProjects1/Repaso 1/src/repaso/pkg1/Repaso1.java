package repaso.pkg1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author sebas
 */
public class Repaso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double sal_men, sal_an, cont, cargo, sal_t, sal_m;
        sal_men=1500;
        
        for(cont=1;cont<7;cont++ ){
            sal_an=(sal_men*12);
            cargo=sal_an+(sal_an*0.1);
            sal_t= sal_an + cargo; 
            sal_m=sal_t/12;
            sal_t=sal_an;
            System.out.printf("el salario anual del año %s%n%s%n%s%n", cont, "es: $",sal_t);   
            
            System.out.printf("salario mensual en el año %s%n%s%n%s%n", cont, "es: $", sal_m); 
        }
  
        // TODO code application logic here
    }
    
}
