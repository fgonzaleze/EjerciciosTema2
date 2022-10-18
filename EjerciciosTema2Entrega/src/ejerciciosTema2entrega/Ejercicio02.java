package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Diseña una aplicación en la que, dado un número de DNI, calcule la letra que
		// le corresponde.
		// Observa que un número de 8 dígitos está dentro del rango del tipo int.
		int dni;
		int letra;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su DNI sin letra: ");
		dni = sc.nextInt();
		letra = dni % 23;
		switch (letra) {
		case 0 -> {
			System.out.println("La letra de su DNI es T");
		}
		case 1 -> {
			System.out.println("La letra de su DNI es R");
		}
		case 2 -> {
			System.out.println("La letra de su DNI es W");
		}
		case 3 -> {
			System.out.println("La letra de su DNI es A");
		}
		case 4 -> {
			System.out.println("La letra de su DNI es G");
		}
		case 5 -> {
			System.out.println("La letra de su DNI es M");
		}
		case 6 -> {
			System.out.println("La letra de su DNI es Y");
		}
		case 7 -> {
			System.out.println("La letra de su DNI es F");
		}
		case 8 -> {
			System.out.println("La letra de su DNI es P");
		}
		case 9 -> {
			System.out.println("La letra de su DNI es D");
		}
		case 10 -> {
			System.out.println("La letra de su DNI es X");
		}
		case 11 -> {
			System.out.println("La letra de su DNI es B");
		}
		case 12 -> {
			System.out.println("La letra de su DNI es N");
		}
		case 13 -> {
			System.out.println("La letra de su DNI es J");
		}
		case 14 -> {
			System.out.println("La letra de su DNI es Z");
		}
		case 15 -> {
			System.out.println("La letra de su DNI es S");
		}
		case 16 -> {
			System.out.println("La letra de su DNI es Q");
		}
		case 17 -> {
			System.out.println("La letra de su DNI es V");
		}
		case 18 -> {
			System.out.println("La letra de su DNI es H");
		}
		case 19 -> {
			System.out.println("La letra de su DNI es L");
		}
		case 20 -> {
			System.out.println("La letra de su DNI es C");
		}
		case 21 -> {
			System.out.println("La letra de su DNI es K");
		}
		case 22 -> {
			System.out.println("La letra de su DNI es E");
		}
		}

		sc.close();
	}
}
