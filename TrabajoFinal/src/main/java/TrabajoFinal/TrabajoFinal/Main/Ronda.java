package TrabajoFinal.TrabajoFinal.Main;

public class Ronda {

	private int idRonda;
	private int numeroRonda;
	private int idFase;
	private String nombreFase;

	public Ronda(int idRonda, int numeroRonda, int idFase, String nombreFase) {
		this.idRonda = idRonda;
		this.numeroRonda = numeroRonda;
		this.idFase = idFase;
		this.nombreFase = nombreFase;
	}

	public int getIdRonda() {
		return idRonda;
	}

	public void setIdRonda(int idRonda) {
		this.idRonda = idRonda;
	}

	public int getNumeroRonda() {
		return numeroRonda;
	}

	public void setNumeroRonda(int numeroRonda) {
		this.numeroRonda = numeroRonda;
	}

	public int getIdFase() {
		return idFase;
	}

	public void setIdFase(int idFase) {
		this.idFase = idFase;
	}

	public String getNombreFase() {
		return nombreFase;
	}

	public void setNombreFase(String nombreFase) {
		this.nombreFase = nombreFase;
	}

}
