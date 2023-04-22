package TrabajoFinal.TrabajoFinal.Main;

public class Pronostico {

	private int idPronostico;
	private Persona persona;
	private Partido partido;
	private int resultadoPronostico;

	private String resultado() {
		String resultado = "";

		if (partido.getGolesEquipo1() > partido.getGolesEquipo2()) {
			resultado = "ganador " + partido.getEquipo1();
		}
		if (partido.getGolesEquipo1() < partido.getGolesEquipo2()) {
			resultado = "ganador " + partido.getEquipo2();
		} else {
			resultado = "empate";
		}

		return resultado;
	}

	@Override
	public String toString() {
		return persona.toString() + "pronostica que el resultado es: " + resultado();
	}

	public Pronostico(int idPronostico, Persona persona, Partido partido, int resultadoPronostico) {
		this.idPronostico = idPronostico;
		this.persona = persona;
		this.partido = partido;
		this.resultadoPronostico = resultadoPronostico;
	}

	public int getIdPronostico() {
		return idPronostico;
	}

	public void setIdPronostico(int idPronostico) {
		this.idPronostico = idPronostico;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}

	public int getResultadoPronostico() {
		return resultadoPronostico;
	}

	public void setResultadoPronostico(int resultadoPronostico) {
		this.resultadoPronostico = resultadoPronostico;
	}

}
