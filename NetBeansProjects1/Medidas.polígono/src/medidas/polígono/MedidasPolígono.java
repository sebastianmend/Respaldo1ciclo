package medidas.polígono;
//medidas.polígono 
//programa que calcula el área de un polígono
import java.util.Scanner;//el programa usa la clase scanner
 /* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author UTPL
 */
public class MedidasPolígono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
     Scanner leer=new Scanner(System.in);
     
     double lc, at, ar, A, B, D, att, area;
     
       
     System.out.println("Programa que permite el cálculo de un polígono compuesto");
     
     System.out.println("ingrese el lado del cuadrado");
     lc=leer.nextDouble();
     
     System.out.println("ingrese la altura del rectángulo");
     ar=leer.nextDouble();
     
     System.out.println("ingrese la altura del triángulo");
     at=leer.nextDouble();
     
     
     
     A=(lc*lc);
     B=(lc*at/2); 
     att=B*3;
     D=lc*ar;
     area=A+att+D;
     
     System.out.printf("El área de un polígono compuesto es:%,.3f%n", area);
     
      
      
        
        // TODO code application logic here
    }    
}
