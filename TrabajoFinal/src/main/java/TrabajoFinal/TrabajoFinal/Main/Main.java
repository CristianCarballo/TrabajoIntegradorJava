package TrabajoFinal.TrabajoFinal.Main;

import java.util.ArrayList;

public class Main {
	public static void main(String... param) throws ClassNotFoundException {

		GestorBD gestor = new GestorBD();
		Puntaje puntaje = new Puntaje();
		
		ArrayList<Persona> listaPersonas = gestor.listaPersonas();
		
		
		// lo que falta es mostrar los datos del ganador
		// podriamos ordenarlos, el que mas puntos hizo primero por ej
		// podriamos decorar con un poco de info si acerto algunas rondas o algunas fases,
		// creo que no falta nada mas
		
		for(Persona persona : listaPersonas) {
			int puntos = 0;
			puntos = puntaje.calculaPuntaje(persona);
			System.out.println(persona + " " + puntos);
		}
	}
}