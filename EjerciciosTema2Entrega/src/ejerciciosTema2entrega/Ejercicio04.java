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
		//Si el numero esta comprendido entre el 16 y el 99, haremos un switch con las decenas y con las unidades que nos dirá por un lado las decenas y por otro las unidades
		//if (num >= 16 && num <= 99) {
			//switch (decena) {
			//case 1 -> ;
			//}
		//}
		//if (decimal = 2) {
			//System.out.println("");
		//}
		//Apartamos primero los números que escritos tienen un nombre especial no conformado por dos números
		if (num >= 11 && num<= 15) {
			switch (num) {
			case 11 -> System.out.println("El número es once");
			case 12 -> System.out.println("El número es doce");
			case 13 -> System.out.println("El número es trece");
			case 14 -> System.out.println("El número es catorte"); 
			case 15 -> System.out.println("El número es quince");
			}
		}
		

	}

}
