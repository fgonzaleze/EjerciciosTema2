package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Escribe un programa que solicite al usuario un número entero entre 1 y 99. El
		// programa debe mostrarlo con letras,
		// por ejemplo, para 56 se verá: “cincuenta y seis”.
		int num;
		int decena;
		int unidad;
		String unidadStr;
		String decenaStr;
		Scanner sc = new Scanner(System.in);
		// Pedimos el numero
		System.out.println("Escriba un número: ");
		num = sc.nextInt();
		// Las decenas serán el numero dividido entre 10
		decena = num / 10;
		// Las unidades seran el numero con el modulo 10
		unidad = num % 10;
		if ((num >= 11 && num <= 15) || num == 20 || num == 10) {
			switch (num) {
			case 10 -> System.out.println("Diez");
			case 11 -> System.out.println("Once");
			case 12 -> System.out.println("Doce");
			case 13 -> System.out.println("Trece");
			case 14 -> System.out.println("Catorte");
			case 15 -> System.out.println("Quince");
			case 20 -> System.out.println("Veinte");
			}
		} else {
			switch (decena) {
			case 0 -> {
				decenaStr = "";
			}
			case 1 -> {
				decenaStr = "dieci";
			}
			case 2 -> {
				decenaStr = "veinti";
			}
			case 3 -> {
				decenaStr = "treinta";
			}
			case 4 -> {
				decenaStr = "cuarenta";
			}
			case 5 -> {
				decenaStr = "cincuenta";
			}
			case 6 -> {
				decenaStr = "sesenta";
			}
			case 7 -> {
				decenaStr = "setenta";
			}
			case 8 -> {
				decenaStr = "ochenta";
			}
			case 9 -> {
				decenaStr = "noventa";
			}
			default -> {
				decenaStr = "";
			}
			}
			if (num == 10) {
				System.out.println("Diez");
			}
			if (num == 20) {
				System.out.println("Veinte");
			}
			switch (unidad) {
			case 1 -> {
				unidadStr = "uno";
			}
			case 2 -> {
				unidadStr = "dos";
			}
			case 3 -> {
				unidadStr = "tres";
			}
			case 4 -> {
				unidadStr = "cuatro";
			}
			case 5 -> {
				unidadStr = "cinco";
			}
			case 6 -> {
				unidadStr = "seis";
			}
			case 7 -> {
				unidadStr = "siete";
			}
			case 8 -> {
				unidadStr = "ocho";
			}
			case 9 -> {
				unidadStr = "nueve";
			}
			default -> {
				unidadStr = "";
			}
			}
			if (unidad == 0 || decena  == 0 || decena == 2 || decena == 1) {
				System.out.println(decenaStr + unidadStr);
			} else {
				System.out.println(decenaStr + " y " + unidadStr);
			}
		}
		sc.close();
	}

}
