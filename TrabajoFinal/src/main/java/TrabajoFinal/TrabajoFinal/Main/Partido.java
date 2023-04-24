package TrabajoFinal.TrabajoFinal.Main;

public class Partido {

	private int idPartido;
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	private Ronda ronda;	

	public int getResultadoPartido() { // devuelve el resultado del partido
		
		//( 1: ganador equipo1, 2: ganador equipo2, 3: empate)
		
		if (golesEquipo1 > golesEquipo2) 
			return 1;
		if (golesEquipo1 < golesEquipo2)
			return 2;
		else
			return 3;
	}

	@Override
	public String toString() {
		String resultado = "";

		if (golesEquipo1 > golesEquipo2) {
			resultado = "ganador del partido: " + equipo1.toString() + " con un resultado de " + golesEquipo1 + " a "
					+ golesEquipo2;
		}

		if (golesEquipo1 < golesEquipo2) {
			resultado = "ganador del partido: " + equipo2.toString() + " con un resultado de " + golesEquipo2 + " a "
					+ golesEquipo1;
		}

		if (golesEquipo1 == golesEquipo2) {
			resultado = "empate con un resultado de " + golesEquipo1 + " a " + golesEquipo2;
		}

		return resultado;
	}

	public Partido(int idPartido, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2, Ronda ronda) {
		this.idPartido = idPartido;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
		this.ronda = ronda;
	}

	public Partido() {
	}

	public int getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(int idPartido) {
		this.idPartido = idPartido;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
	
	public Ronda getRonda() {
		return ronda;
	}

	public void setRonda(Ronda ronda) {
		this.ronda = ronda;
	}
}
