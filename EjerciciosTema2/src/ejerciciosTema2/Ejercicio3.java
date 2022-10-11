package ejerciciosTema2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el número con decimales: ");
		num = sc.nextDouble();
		if (num <=1 && num !=0 && num >=-1 && num !=1 && num!=-1) {
			System.out.println("El número es casi-cero");
		}
		else {
			System.out.println("El número no es casi-cero");
		}
		
		sc.close();
	}

}
