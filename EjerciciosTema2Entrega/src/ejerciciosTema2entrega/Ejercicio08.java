package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Determinar el precio de un billete de tren, conociendo la distancia a recorrer, y sabiendo que si el número de días de 
		// estancia es superior a 7 y la distancia superior a 800 km el billete tiene una reducción del 30%. El precio por kilómetro es de 2,5€. 
		// La distancia a recorrer y el número de días de estancia los debes solicitar al usuario por teclado.
		
		//Prueba: Introduzco 600, 2; el precio del billete es 1500
		//Prueba: Introduzco 800, 7; el precio del billete es 1400
		
		int distancia;																	// Variable para declarar la distancia
		int dias;																		// Variable para declarar los días
		double precioBillete;															// Variable para declarar el precio
		final double precioKm = 2.5;													// Variable final para el precio que siempre será 2.5€
		double reduccion;																// Variable para declarar la reducción
		Scanner sc = new Scanner(System.in);
		System.out.println("Distancia en km: ");										// Pedimos la distancia en km
		distancia = sc.nextInt();
		System.out.println("Días que pasará: ");										// Pedimos los días que pasará
		dias = sc.nextInt();
		precioBillete = distancia * precioKm;											// Multiplicamos la distancia por el precio por km para obtener el precio del billete
		if ( dias >= 7 && distancia >= 800) {											// Condicional ya que si los días son más de 7 y la distancia mayor a 800km
			reduccion = precioBillete * 0.3;											// La reduccion es el precio del billete por 0,3 (30%)
			precioBillete = precioBillete - reduccion;									// El precio del billete sería el precio obtenido anteriormente menos la reducción. 
			System.out.println("El precio del billete es: " + precioBillete);
		} else {																		// Si no se produce la condición, el else será el precio del billete sin la reduccion
			System.out.println("El precio del billete es: " + precioBillete);
		}
		sc.close();																		// Cerramos el escáner
	}

}
