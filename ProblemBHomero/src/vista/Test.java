package vista;

public class Test {

	public static void main(String[] args) {
		
		int[][] estado = modelo.Calculo.obtenerTareas(5,4);
		modelo.Calculo.imprimirMatriz(estado);
		int []puntajes = modelo.Calculo.definirPuntajes(estado,5, 4);
		modelo.Calculo.asignarPuntajes(estado, puntajes, 5,4);
		System.out.println("\n");
		modelo.Calculo.ordenarPuntajes(puntajes,5);
		int[][] ordenado = modelo.Calculo.ordenarPuntajes(puntajes, 5);
		
		for (int i = 0; i < ordenado.length; i++) {
			for (int j = 0; j < ordenado[i].length; j++) {
				System.out.println("Participante n° "+ordenado[i][0]+" puntaje: "+ordenado[i][1]);
			}
		}
	}

}
