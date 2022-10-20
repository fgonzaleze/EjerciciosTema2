package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Realiza el “juego de la suma”, que consiste en que aparezcan dos números aleatorios (comprendidos entre 1 y 99)
		//que el usuario tiene que sumar. La aplicación debe indicar si el resultado de la operación es correcto o incorrecto. 
		//Para calcular números aleatorios debes usar la función Math.random(), que devuelve un número aleatorio comprendido entre 0 y 1.
		int num1;//Variable para el primer número que pidamos
		int num2;//Variable para el segundo numero que pidamos
		int resultado;//Variable para calcular nosotros el resultado
		Scanner sc = new Scanner(System.in);
		//Para ambos números (num1 y num2) hacemos la siguiente cuenta, multiplicamos un numero aleatorio a traves de Math.random(), que al multiplicarlo por 99 y convertir toda la operación
		//en (int) evitaremos 
		num1 = (int) (Math.random()*99);
		num2 = (int) (Math.random()*99);
		
		System.out.println("Introduzca la suma de los siguientes números " + num1 + " y " + num2);
		resultado =  sc.nextInt();
		
		if (resultado == num1 + num2) {
			System.out.println("Enhorabuena, resultado correcto.");
		} else {
			System.out.println("Resultado incorrecto.");
		}
		sc.close();

	}
	

}
