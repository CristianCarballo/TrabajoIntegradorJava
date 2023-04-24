package TrabajoFinal.TrabajoFinal.Main;

import java.util.ArrayList;

public class Main {
	public static void main(String... param) throws ClassNotFoundException {

		GestorBD gestor = new GestorBD();

		ArrayList<Persona> listaPersonas = gestor.listaPersonas();
		
		ArrayList<Partido> listaPartidos = gestor.listaPartidos();
		
		
		for(Partido p : listaPartidos) {
			System.out.println(p);
		}
	}
}