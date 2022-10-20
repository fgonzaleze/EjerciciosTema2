package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo que muestre la hora después de incrementarle un segundo.
		int seg;
		int min;
		int hora;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la hora: ");
		hora = sc.nextInt();
		System.out.println("Introduzca los minutos: ");
		min = sc.nextInt();
		System.out.println("Introduzca la segundos: ");
		seg = sc.nextInt();
		seg = seg + 1;
		
		if (seg>59) {
			seg = 0;
			min = min + 1;
		}
		if (min>59) {
			min = 0;
			hora = hora + 1;
		}
		System.out.println("La hora es: " + hora + " horas " + min + " minutos " + seg + " segundos ");
	}

}
