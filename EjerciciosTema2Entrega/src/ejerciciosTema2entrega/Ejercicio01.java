package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. La aplicación tendrá que indicar si 
		// el número introducido es capicúa.
		
		//Prueba: Introduzco 1234, no es capicua
		//Prueba: Introduzco 1, da resultado capicúa
		//Prueba: Introduzco 11, da resultado capicúa
		//Prueba: Introduzco 12, no es capicúa
		//Prueba: Introduzco 111, da resultado capicúa
		//Prueba: Introduzco 122, no es capicúa
		//Prueba: Introduzco 1221, es capicúa
		//Prueba: Introduzco 1212, no es capicúa
		
		int num; 																				//Declaramos la variable para el número que vamos a pedir
		int u;																					//Utilizamos esta variable para las unidades
		int d;																					//Utilizamos esta variable para las decenas
		int c;																					//Utilizamos esta variable para los centenares
		int m;																					//Utilizamos esta variable para los millares
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número del 1 al 9999: ");								//Imprimimos para poder obtener el número deseado
		num = sc.nextInt();																		//El número será el introducido
		u = num % 10;																			//Para calcular las unidades, utilizamos módulo 10 para obtener el resto
		d = (num/10)%10;																		//Para calcular las decenas, primero dividimos el número entre 10 y posteriormente usamos el modulo 10
		c = (num/100)%10;																		//Para calcular las centenas, dividimos el número entre 100 y después usamos el modulo 10
		m = num / 1000;																			//Para calcular los millares, simplementes tenemos que dividir entre 1000
		
		if (num <= 9) {																			//Usamos el condicional if por si el número tiene una cifra, es decir, es menor o igual que 9
			System.out.println("Es capicúa");													
		} else if (num <= 99 && u == d) {														//Vemos si el número tiene dos cifras, y para que sea capicúa, la unidad tiene que ser igual a la decena
			System.out.println("Es capicúa");													
		} else if (num <= 999 && u == c) {														//Vemos si el número tiene 3 cifras, y para que sea capicúa, la unidad tiene que ser igual a la centena
			System.out.println("Es capicúa");									
		} else if (num <= 9999 && m == u && c == d) {											//Vemos si el número tiene 4 cifras, y para que sea capicúa se tiene que cumplir que millar y la unidad
			System.out.println("Es capicúa");													//sean iguales, pero también que la centena y la decena lo sean
		} else { 
			System.out.println("No es capicúa");												//Si no se cumpliese nada de lo anterior, el número no es capicúa.
		}
		sc.close();																				//Cerramos el escáner
	}

}
