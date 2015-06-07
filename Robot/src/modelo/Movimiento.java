package modelo;

public class Movimiento {

	private int cantidadPuntos;

	public Movimiento(int cantidad) {
		this.cantidadPuntos = cantidad;
	}

	public int getCantidadPuntos() {
		return cantidadPuntos;
	}

	public void setCantidadPuntos(int cantidadPuntos) {
		this.cantidadPuntos = cantidadPuntos;
	}

	/**
	 * Avanza paralelo a uno de los ejes coordenados (todos los giros en 90
	 * grados), siempre gira a la derecha, y en donde no hay tres puntos
	 * seguidos colineales.
	 */
	public static void paraleloDerecha() {

	}

	/**
	 * Avanza paralelo a uno de los ejes coordenados (todos los giros en 90
	 * grados), siempre debe girar a la izquierda, o siempre debe girar a la
	 * derecha, y en donde no hay tres puntos seguidos colineales.
	 */
	public static void paraleloIzquierda() {

	}

	/**
	 * Avanza paralelo a uno de los ejes coordenados (todos los giros en 90
	 * grados) pero algunos giros podrán ser a la izquierda y algunos a la
	 * derecha, y en donde no hay tres puntos seguidos colineales.
	 */
	
	
	/**
	 * Girar en cualquier direccion y en cualquier angulo, y en algunos puntos
	 * puede que incluso no necesite girar ni a la izquierda ni a la derecha
	 * (puntos colineales).
	 */
}
