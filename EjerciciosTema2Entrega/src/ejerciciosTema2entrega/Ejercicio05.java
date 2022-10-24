package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Utiliza un operador ternario para calcular el valor absoluto de un número que se solicita al usuario por teclado.
		
		//Introduzco 12, indica que el valor de 12 es 12
		//Introduzco -12, indica que el valor de -12 es 12
		
		int num;																	// Variable para conocer el número que solicitemos
		int solucion;																// Variable que usaremos para la solución
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para saber el valor absoluto");		// Pedimos el número	
		num = sc.nextInt();
		
		if (num < 0) {																// Condicional, si el número es menor que cero, la solución será quitar el número de negativo
			solucion = -num;
		} else {																	// Sino, la solución será el mismo número
			solucion = num;
		}
		System.out.println("El valor absoluto de " + num + " es " + solucion);		// Imprimimos la solución
		sc.close();																	// Cerramos el escáner
	}

}
