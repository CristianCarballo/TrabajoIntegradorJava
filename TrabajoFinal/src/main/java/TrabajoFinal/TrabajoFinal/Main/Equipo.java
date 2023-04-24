package TrabajoFinal.TrabajoFinal.Main;

public class Equipo {

	private int idEquipo;
	private String nombre;
	private int anioFundacion;

	@Override
	public String toString() {
		return nombre;
	}

	public Equipo(int idEquipo, String nombre, int anioFundacion) {
		this.idEquipo = idEquipo;
		this.nombre = nombre;
		this.anioFundacion = anioFundacion;
	}

	public Equipo() {
	}

	public int getIdEquipo() {
		return idEquipo;
	}

	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getAnioFundacion() {
		return anioFundacion;
	}

	public void setAnioFundacion(int anioFundacion) {
		this.anioFundacion = anioFundacion;
	}

}
