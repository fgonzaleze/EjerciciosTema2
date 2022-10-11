package ejerciciosTema2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num1;
		int num2;
		boolean iguales;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Escriba el segundo número: ");
		num2 = sc.nextInt();
		iguales = num1 == num2;
		System.out.println("Son iguales: " + iguales);
		sc.close();
		

	}

}
