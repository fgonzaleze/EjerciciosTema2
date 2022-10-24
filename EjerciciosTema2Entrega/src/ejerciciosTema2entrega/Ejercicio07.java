package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Dada una hora por teclado, (horas, minutos y segundos) realiza un algoritmo que muestre la hora después de incrementarle un segundo.
		
		//Prueba: Introduzco 21, 00, 00; la Hora es: 21h, 0 min y 1 seg
		//Prueba: Introduzco 21, 59, 59; la hora es: 22h, 0 min y 0 seg
		
		int seg;																								// Variable para declarar los segundos
		int min;																								// Variable para declarar los minutos
		int hora;																								// Variable para declarar las horas
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca la hora: ");
		hora = sc.nextInt();																					// Obtenemos la hora
		System.out.println("Introduzca los minutos: ");
		min = sc.nextInt();																						// Obtenemos los minutos
		System.out.println("Introduzca la segundos: ");
		seg = sc.nextInt();																						// Obtenemos los segundos
		seg = seg + 1;																							// Añadimos un segundo como nos pide
		
		if (seg>59) {																							// Condicional en caso de que los segundos sean 59
			seg = 0;																							// Los segundos pasarán a ser 0
			min = min + 1;																						// y los minutos se sumará 1, al ser 60 seg un min completo
		}
		if (min>59) {																							// Otro condicional, en este caso para los minutos
			min = 0;																							// pasarían a ser 0 al sumarle uno más
			hora = hora + 1;																					// al ser un minuto completo, se sumaría 1 hora
		}
		System.out.println("La hora es: " + hora + " horas " + min + " minutos " + seg + " segundos ");			// Imprimimos por último las horas, los minutos y los segundos
		sc.close();																								// Cerramos escáner
	}

}
