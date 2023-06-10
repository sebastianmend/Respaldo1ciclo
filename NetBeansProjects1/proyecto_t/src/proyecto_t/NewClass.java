
// En java, el nombre de un archivo fuente debe coincidir con el nombre de la clase que contiene,
// por lo que este archivo debería llamarse "EJ_7.java."

import java.io.*;

public class NewClass {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double minutos;
		double tiempo;
		double total;
		System.out.println("Ingrese el tiempo que ha estado en el estacionamiento (en minutos)");
		minutos = Double.parseDouble(bufEntrada.readLine());
		tiempo = minutos/60;
		if ((tiempo<=2)) {
			total = 0.5*tiempo;
			System.out.println("Su total a pagar es: $ "+total);
		}
		if ((tiempo<=5) & (tiempo>2)) {
			total = ((tiempo-2)*0.4)+1;
			System.out.println("Su total a pagar es: $ "+total);
		}
		if ((tiempo<=10) & (tiempo>5)) {
			total = ((tiempo-5)*0.3)+2.2;
			System.out.println("Su total a pagar es: $ "+total);
		}
		if ((tiempo>10)) {
			total = (tiempo*2);
			System.out.println("Su total a pagar es: $ "+total);
		}
	}


}
