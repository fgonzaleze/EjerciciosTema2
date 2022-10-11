package ejerciciosTema2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int num;
		boolean par;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un número para saber si es par: ");
		num = sc.nextInt();
		par = (num % 2) == 0;
		System.out.println("Es par: " + par);
		sc.close();

	}

}
