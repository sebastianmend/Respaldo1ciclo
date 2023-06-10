
package problema3;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double i, total;
        total=10;        
        for(i=1;i<=20;i=i+1){
            total=total*2;
            System.out.printf("El mes número %,.0f%n", i);
            System.out.printf("$%,.2f%n", total );
        }
        
        
        // TODO code application logic here
    }
    
}
