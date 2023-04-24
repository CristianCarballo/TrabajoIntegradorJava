package TrabajoFinal.TrabajoFinal.Main;

public class Puntaje {
	
	public Puntaje() {
	}
	
	private int calculaPuntaje(Pronostico pronostico) { 
		
		int puntajeTotal = 0;
		int puntosExtraPorRonda = 3;
		int puntosExtraPorFase = 5;
		
		// suma el puntaje por ganar un partido
		if(pronostico.getResultadoPronostico() == pronostico.getPartido().getResultadoPartido()) { 
			puntajeTotal++;
		}
		
		/*
		 * // suma el puntaje extra por ganar una ronda if() { puntajeTotal +=
		 * puntosExtraPorRonda; }
		 * 
		 * // suma el puntaje extra por ganar una fase if() { puntajeTotal +=
		 * puntosExtraPorFase; }
		 */
		
		return puntajeTotal;
	}
}
