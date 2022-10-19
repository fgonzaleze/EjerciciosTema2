package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Utiliza un operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.
		int num;
		int solucion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para saber el valor absoluto");
		num = sc.nextInt();
		
		if (num < 0) {
			solucion = -num;
		} else {
			solucion = num;
		}
		System.out.println("El valor absoluto de " + num + " es " + solucion);
	}

}
