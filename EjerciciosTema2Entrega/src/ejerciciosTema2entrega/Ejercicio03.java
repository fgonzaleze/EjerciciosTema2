package ejerciciosTema2entrega;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		//En una granja se compra diariamente una cantidad de comida para los animales. Los animales son todos de la misma especie y 
		//sabemos que cada animal come los mismos kilos de comida de media diariamente.
		//Diseña un programa que solicite al usuario los valores anteriores (cantidad de comida comprada, número de animales y kilos de 
		//comida que come cada animal), y determine si disponemos de alimento suficiente para cada animal. En caso negativo, ha de calcular 
		//cuál es la ración que corresponde a cada uno de los animales.
		//Nota: Evita que la aplicación realice divisiones por cero.
		int comidaComprada;
		int numAnimales;
		int kilosComida;
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de comida comprada en kilos: ");
		comidaComprada = sc.nextInt();
		System.out.println("Número de animales a alimentar: ");
		numAnimales = sc.nextInt();
		System.out.println("Kilos de comida que necesita cada animal: ");
		numAnimales = sc.nextInt();
		
		

	}

}
