package ejerciciosTema2;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Escriba el segundo número: ");
		num2= sc.nextInt();
		System.out.println("Escriba el segundo número: ");
		num3= sc.nextInt();
		//if (num1 >= num2 num2 >= num3  num3 <= num1){
			System.out.println( num1 + " , " + num2);
		} else { 
			System.out.println( num2 + " , " + num1);

		}
	}
}
