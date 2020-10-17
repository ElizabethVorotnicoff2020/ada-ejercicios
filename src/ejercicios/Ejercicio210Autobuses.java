package ejercicios;

import java.util.Scanner;

public class Ejercicio210Autobuses {
	private static final int COSTO_A = 2;
	private static final int COSTO_B = 7;
	private static final int COSTO_C = 12;

	public static void main(String[] args) {

		System.out.println("Ingrese la cantidad de Personas");
		// Solicitar la cantidad de personas
		Scanner sc = new Scanner(System.in);
		int personas = sc.nextInt();

		System.out.println("Ingreso: " + personas);

		// Solicitar la cantidad de km
		System.out.println("Ingrese la cantidad de Kilometros");
		int km = sc.nextInt();

		// Solicitar el tipo de autobus
		System.out.println("Ingrese tipo de autobus (A, B, C)");
		String tipo = sc.next();

		// Calcular el costo del transporte
		int totalPersonas = 20;

		if (personas > 20) {
			totalPersonas = personas;
		}

		// calcular costo total:
		// total de personas * kilometro * precio

		int costoTotal = totalPersonas * km;
		float totalGrupal = 0;

		switch (tipo.toUpperCase()) {
		case "A":
			totalGrupal = costoTotal * COSTO_A;
			break;
		case "B":
			totalGrupal = costoTotal * COSTO_B;
			break;
		case "C":
			totalGrupal = costoTotal * COSTO_C;
			break;

		}

		System.out.println("El total grupal es: " + totalGrupal);

		sc.close();

	}

}
