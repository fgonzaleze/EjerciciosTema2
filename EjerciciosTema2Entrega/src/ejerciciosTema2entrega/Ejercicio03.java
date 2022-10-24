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
		
		//Prueba: Introduzco 40, 10, y 4, hay comida suficiente
		//Prueba: Introduzco 40, 11 y 4, no hay comida suficiente, la racion para cada animal es: 0,9
		//Prueba: Introduzco 40, 0 y 4, no hay animales que alimentar
		
		double comidaComprada;																			//Variable para saber la comida comprada, de la que disponemos para repartir
		double numAnimales;																				//Variable para saber la candidad de animales 
		double kilosComida;																				//Variable para saber  la cantidad de comida que necesita cada animal
		double resultadoComida;																			//Variable para establecer el resultado de la comida que necesitaremos
		double porcion;																					//Variable para establecer la porción que tomará cada animal
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de comida comprada: ");
		comidaComprada = sc.nextInt();																	//Obtenemos la comida comprada
		System.out.println("Número de animales a alimentar: ");
		numAnimales = sc.nextInt();																		//Obtenemos el número de animales que tendremos que alimentar
		System.out.println("Kilos de comida que necesita cada animal: ");
		kilosComida = sc.nextInt();																		//Obtenemos la comida que necesita cada animal
		resultadoComida = numAnimales*kilosComida;														//Calculamos la comida multiplicando los animales que tenemos por la comida que necesitan
		porcion = comidaComprada / (numAnimales*kilosComida);											//La porción será la comida comprada entre el número de animles por la comida que necesita
		if  (numAnimales == 0) {																		//Usamos el condicional if por si no hubiese animales para alimentar
			System.out.println("No hay animales que alimentar");
		}
		else if (resultadoComida <= comidaComprada) {													//Usamos el else if en caso de que haya comida suficiente, que el resultado de la comida, 
			System.out.println("Hay comida suficiente");												//será menor que la comida comprada
		} else { 																						//El else en este caso, será la otra posibilidad, y es que no haya comida suficiente. 
			System.out.println("No hay comida suficiente, la ración para cada animal es:" + porcion);	//Aún así aunque no haya comida suficiente, podemos repartir la comida equitativamente con la variable porción.
		}
		sc.close();																						//Cerramos el escáner
	}

}
