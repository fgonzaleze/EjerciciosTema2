package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Escribe un programa que solicite al usuario un número entero entre 1 y 99. El
		// programa debe mostrarlo con letras,
		// por ejemplo, para 56 se verá: “cincuenta y seis”.
		
		//Prueba: Introduzco 1, sale "uno"
		//Prueba: Introduzco 11, sale "once"
		//Prueba: Introduzco 20, sale "veinte"
		//Prueba: Introduzco 21, sale "veintiuno"
		//Prueba: Introduzco 30, sale "treinta"
		//Prueba: Introduzco 35, sale "treinta y cinco"
		//Prueba: Introduzco 50, sale "cincuenta"
		
		int num;
		int decena;
		int unidad;
		String unidadStr;															// Usamos un string para las unidades
		String decenaStr;															// Usamos un string para las decenas
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número: ");									// Pedimos el número
		num = sc.nextInt();
		decena = num / 10;															// Las decenas serán el numero dividido entre 10
		unidad = num % 10;															// Las unidades seran el numero con el modulo 10
		if ((num >= 11 && num <= 15) || num == 20 || num == 10) {					// Ponemos un condicional con las siguientes condiciones: si está entre el 11 y el 15 (es decir, 
			switch (num) {															// "once", "doce", "trece", "catorce" y "quince"); o si el número es 20 ("veinte"); o si el número es
			case 10 -> System.out.println("diez");									// 10 ("diez"). Estas son las condiciones que tienen que comprobarse primero, 
			case 11 -> System.out.println("once");									// ya que conforman las excepciones gramaticales.
			case 12 -> System.out.println("doce");
			case 13 -> System.out.println("trece");
			case 14 -> System.out.println("catorce");
			case 15 -> System.out.println("quince");
			case 20 -> System.out.println("veinte");
			}
		} else {																	// En el else, ponemos el caso que comprueba si no se cumpliese el if
			switch (decena) {														// En el switch vamos a comprobar en cada case a que decena se corresponde y  
			case 0 -> {																// vamos a asignarlo al string decenaStr, que después utilizaremos
				decenaStr = "";														// Si la decena fuese 0, asignamos "" para que el string esté vacío
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
			switch (unidad) {														// Una vez obtengamos la unidad, usamos el switch con el case para cada uno 
			case 1 -> {																// de los números del 1 al 9, y asignandolos al string
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
			if (unidad == 0 || decena  == 0 || decena == 2 || decena == 1) {		// Por último, si la unidad es 0 o la decena es 0, 2 o 1, querremos 
				System.out.println(decenaStr + unidadStr);							// imprimirlos sin la letra "y", por ejemplo 28 "veintiocho"
			} else {
				System.out.println(decenaStr + " y " + unidadStr);					// En cambio, si no se cumple lo anterior, querremos imprimirlos con una "y" 
			}																		// para completar correctamente el número gramaticalmente.
		}
		sc.close();																	// Cerramos el escáner
	}

}
