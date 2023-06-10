package ejercicio6bimestral;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Ejercicio6bimestral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);{
		double costomanoo;
		double costomo;
		double costotela;
		double talla;
		double tela;
		double tipopant;
		double total;
		double totalcg;
		double totalsg;
                costomo =0;
		System.out.println("ingrese el tipo de pantalon que desea, si desea A ingrese 1 o ingrese 2 si desea B");
		tipopant = leer.nextDouble();
		System.out.println("escribir la  talla que desea (30, 32 o 36)");
		talla = leer.nextDouble();
		System.out.println("ingrese el valor de la tela por metro");
		tela = leer.nextDouble();
		if (tipopant==1) {
			costotela = tela*1.5;
			costomanoo = costotela*0.8;
			if ((talla==32) | (talla==36)) {
				costomo = (costomanoo+costotela)*0.04;
			}
			totalsg = (costomanoo+costotela+costomo);
			totalcg = (totalsg*0.3);
			total = totalcg+totalsg;
		} else {
			costotela = tela*1.8;
			costomanoo = costotela*0.95;
			if ((talla==32) | (talla==36)) {
				costomo = (costomanoo+costotela)*0.04;
			}
			totalsg = (costomanoo+costotela+costomo);
			totalcg = (totalsg*0.3);
			total = totalcg+totalsg;
		}
		System.out.println("la ganancia es de: "+totalcg);
		System.out.println(" el total a pagar es de: "+total);
	}

        
        
        
        
        // TODO code application logic here
    }
    
}
