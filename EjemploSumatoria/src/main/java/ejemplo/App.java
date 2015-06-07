package main.java.ejemplo;

/**
 * Clase de ejemplo de JUnit + Javadoc
 *
 * @author Alfredo Rojas
 * @version 1.0
 *
 */

public class App {
	/**
	 * M�todo que realiza una suma de todos los n�meros contenidos en una serie
	 *
	 * @param secuencia
	 *            Array que contiene una serie de n�meros
	 * @return int Resultado de la suma
	 */
	public int sumatoria(int secuencia[]) {
		int suma = 0;
		for (int i = 0; i < secuencia.length; i++) {
			suma += secuencia[i];
		}
		return suma;
	}

	/**
	 * M�todo que realiza una resta de dos numero
	 * 
	 * @param resta1
	 * @param resta2
	 * @return int resultado de la resta
	 */
	public int resta(int resta1, int resta2) {
		return resta1 - resta2;
	}

	// M�todo que calcula el factorial de un n�mero 'a'
	/**
	 * 
	 * @param a Entero
	 * @return numero
	 */
	public int factorial(int a) {
		int factorial = 1;
		// for recorre desde 1 hasta 'a'
		for (int i = 1; i <= a; i++) {
			factorial *= i;
		}
		return factorial;
	}
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
