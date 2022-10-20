package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99)
		//que el usuario tiene que sumar. La aplicación debe indicar si el resultado de la operación es correcto o incorrecto. 
		//Para calcular números aleatorios debes usar la función Math.random(), que devuelve un número aleatorio comprendido entre 0 y 1.
		
		int num1;																						// Variable para el primer número que pidamos
		int num2;																						// Variable para el segundo numero que pidamos
		int resultado;																					// Variable para calcular nosotros el resultado
		Scanner sc = new Scanner(System.in);
		num1 = (int) (Math.random()*99);																// Para ambos números (num1 y num2) hacemos la siguiente cuenta, multiplicamos
		num2 = (int) (Math.random()*99);																// un numero aleatorio a traves de Math.random(), que al multiplicarlo por 99 
																										// y convertir toda la operación en (int) evitaremos los decimales
		System.out.println("Introduzca la suma de los siguientes números " + num1 + " y " + num2);
		resultado =  sc.nextInt();
		
		if (resultado == num1 + num2) {																	// Si el resultado es igual a los números que calculemos el resultado será correcto
			System.out.println("Enhorabuena, resultado correcto.");
		} else {																						// Si lo primero no se cumple, es que el resultado no será correcto
			System.out.println("Resultado incorrecto.");
		}
		sc.close();																						// Cerramos el escáner

	}
	

}
