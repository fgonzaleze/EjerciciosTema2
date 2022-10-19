package ejerciciosTema2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Añadir comentarios
		double raiz;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el valor de a: ");
		a = sc.nextDouble();
		System.out.println("Escriba el valor de b: ");
		b = sc.nextDouble();
		System.out.println("Escriba el valor de c: ");
		c = sc.nextDouble();
		raiz = b*b - 4*a*c;
		if(raiz <0) {
			System.out.println("No hay solución");
		} else {
			x1 = (-b + Math.sqrt(raiz)/2*a);
			x2 = (-b - Math.sqrt(raiz)/2*a);
			System.out.println("El resultado es " + x1 + " y " + x2);
		}
		sc.close();
		

	}

}
