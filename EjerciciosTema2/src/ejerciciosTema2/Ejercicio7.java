package ejerciciosTema2;

import java.util.Scanner;

public class Ejercicio7 {
	//Escribir una aplicación que indique cuántas cifras tiene un número introducido por teclado, que está comprendido entre 0 y 99.999. 

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el número con decimales: ");
		num = sc.nextInt();
		if (num < 10) {
			System.out.println("El número tiene una cifra");
		}
	}

}
