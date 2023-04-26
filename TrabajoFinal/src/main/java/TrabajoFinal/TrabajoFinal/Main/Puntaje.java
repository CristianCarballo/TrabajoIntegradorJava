package TrabajoFinal.TrabajoFinal.Main;

import java.util.ArrayList;

public class Puntaje {

	public Puntaje() {
	}

	public int calculaPuntaje(Persona persona) throws ClassNotFoundException {

		int puntajeTotal = 0;
		int puntosExtraPorRonda = 3;
		int puntosExtraPorFase = 5;

		GestorBD gestor = new GestorBD();
		ArrayList<Pronostico> listaPronosticos = gestor.listaPronosticos();

		for (Pronostico pronostico : listaPronosticos) {

			// suma el puntaje por ganar un partido
			if (persona.getIdPersona() == pronostico.getPersona().getIdPersona()
					&& pronostico.getResultadoPronostico() == pronostico.getPartido().getResultadoPartido()) {

				puntajeTotal++;
			}

		}

		return puntajeTotal;
	}
}
