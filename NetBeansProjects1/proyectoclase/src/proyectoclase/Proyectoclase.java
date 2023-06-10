package proyectoclase;
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author sebas
 */
public class Proyectoclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int padece_enfermedad, tipo_de_poliza, toma_alcohol, utiliza_lentes;
        double cargos, costo_de_la_poliza, cuota, edad;
        System.out.print("Ingresa el valor de edad: ");
        edad = leer.nextDouble();
        leer.nextLine();
        System.out.println("Selecciona el valor de tipo de poliza.");
        System.out.println("\t1.- A cobertura amplia");
        System.out.println("\t2.- B da\u00F1os a terceros");
        System.out.print("\t: ");
        do {
            tipo_de_poliza = leer.nextInt();
            leer.nextLine();
            if (tipo_de_poliza<1||tipo_de_poliza>2)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (tipo_de_poliza<1||tipo_de_poliza>2);
        System.out.println("Selecciona el valor de toma alcohol.");
        System.out.println("\t1.- si");
        System.out.println("\t2.- no");
        System.out.print("\t: ");
        do {
            toma_alcohol = leer.nextInt();
            leer.nextLine();
            if (toma_alcohol<1||toma_alcohol>2)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (toma_alcohol<1||toma_alcohol>2);
        System.out.println("Selecciona el valor de utiliza lentes.");
        System.out.println("\t1.- si");
        System.out.println("\t2.- no");
        System.out.print("\t: ");
        do {
            utiliza_lentes = leer.nextInt();
            leer.nextLine();
            if (utiliza_lentes<1||utiliza_lentes>2)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (utiliza_lentes<1||utiliza_lentes>2);
        System.out.println("Selecciona el valor de padece enfermedad.");
        System.out.println("\t1.- si");
        System.out.println("\t2.- no");
        System.out.print("\t: ");
        do {
            padece_enfermedad = leer.nextInt();
            leer.nextLine();
            if (padece_enfermedad<1||padece_enfermedad>2)
                System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
        } while (padece_enfermedad<1||padece_enfermedad>2);
        if(tipo_de_poliza==1)
            cuota=1200;
        else
            cuota=950;
        cargos=0;
        if(toma_alcohol==1)
            cargos=cargos+cuota*0.1;
        if(utiliza_lentes==1)
            cargos=cargos+cuota*0.05;
        if(padece_enfermedad==1)
            cargos=cargos+cuota*0.05;
        if(edad>40)
            cargos=cargos+cuota*0.2;
        else
            cargos=cargos+cuota*0.1;
        costo_de_la_poliza=cuota+cargos;
        System.out.println("Valor de cargos: " + cargos);
        System.out.println("Valor de costo de la poliza: " + costo_de_la_poliza);
        System.out.println("Valor de cuota: " + cuota);
        // TODO code application logic here
    }
    
}
