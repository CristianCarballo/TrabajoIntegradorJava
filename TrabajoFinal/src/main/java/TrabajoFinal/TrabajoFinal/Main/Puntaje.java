package TrabajoFinal.TrabajoFinal.Main;

import java.util.ArrayList;

public class Puntaje {

	public Puntaje() {
	}

	public int calculaPuntaje(Persona persona) throws ClassNotFoundException {

		int puntajeTotal = 0;
		int puntosExtraPorRonda = 3;
		int puntosExtraPorFase = 8;

		GestorBD gestor = new GestorBD();
		ArrayList<Pronostico> listaPronosticos = gestor.listaPronosticos();
		ArrayList<Ronda> listaRondas = gestor.listaRondas();

		boolean banderaRonda = false;
		boolean banderaFase = false;
		
		for (Pronostico pronostico : listaPronosticos) {

			// suma el puntaje por ganar un partido (1 punto por partido)
			if (persona.getIdPersona() == pronostico.getPersona().getIdPersona()
					&& pronostico.getResultadoPronostico() == pronostico.getPartido().getResultadoPartido()) {

				puntajeTotal++;

				for (Ronda ronda : listaRondas) {

					if (ronda.getIdFase() == pronostico.getPartido().getRonda().getIdFase()
							&& ronda.getNumeroRonda() == pronostico.getPartido().getRonda().getNumeroRonda()) {

						banderaRonda = true;
					}

					if (ronda.getIdFase() == pronostico.getPartido().getRonda().getIdFase()) {

						banderaFase = true;
					}
				}
			}
		}
		
		if(banderaRonda) {
			puntajeTotal += puntosExtraPorRonda;
		}
		
		if(banderaFase) {
			puntajeTotal += puntosExtraPorFase;
		}

		return puntajeTotal;
	}
}
