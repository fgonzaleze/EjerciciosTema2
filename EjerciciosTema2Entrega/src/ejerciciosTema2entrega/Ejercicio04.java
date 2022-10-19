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
		switch (unidad){
		case 1 -> {
			yield "uno";
		}
		case 2 -> {
			yield "dos";
		}
		default -> ""
		};
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
