package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		//Escribe un programa que solicite al usuario un número entero entre 1 y 99. El programa debe mostrarlo con letras, 
		//por ejemplo, para 56 se verá: “cincuenta y seis”.
		int num;
		int decena;
		int unidad;
		Scanner sc = new Scanner(System.in);
		//Pedimos el numero
		System.out.println("Escriba un número: ");
		num = sc.nextInt();
		//Las decenas serán el numero dividido entre 10
		decena = num/10;
		//Las unidades seran el numero con el modulo 10
		unidad = num%10;
		switch (decena){
		case 1 -> {
			System.out.println("dieci");
		}
		case 2 -> {
			System.out.println("veinti");
		}
		case 3 -> {
			System.out.println("treinta");
		}
		case 4 -> {
			System.out.println("cuarenta");
		}
		case 5 -> {
			System.out.println("cincuenta");
		}
		case 6 -> {
			System.out.println("sesenta");
		}
		case 7 -> {
			System.out.println("setenta");
		}
		case 8 -> {
			System.out.println("ochenta");
		}
		case 9 -> {
			System.out.println("noventa");
		}
		default -> {
			System.out.println("");
		}
	};
	if (num > 10 ) {
		System.out.println(" y ");
	if (num == 10) {
		System.out.println("Diez");
	if (num == 20) {
		System.out.println("Veinte");
	}
		
	}
	}
		switch (unidad){
			case 1 -> {
				System.out.println("uno");
			}
			case 2 -> {
				System.out.println("dos");
			}
			case 3 -> {
				System.out.println("tres");
			}
			case 4 -> {
				System.out.println("cuatro");
			}
			case 5 -> {
				System.out.println("cinco");
			}
			case 6 -> {
				System.out.println("seis");
			}
			case 7 -> {
				System.out.println("siete");
			}
			case 8 -> {
				System.out.println("ocho");
			}
			case 9 -> {
				System.out.println("nueve");
			}
		}
		if (num >= 11 && num<= 15) {
			switch (num) {
			case 11 -> System.out.println("Once");
			case 12 -> System.out.println("Doce");
			case 13 -> System.out.println("Trece");
			case 14 -> System.out.println("Catorte"); 
			case 15 -> System.out.println("Quince");
			}
		}
		

	}

}
