package TrabajoFinal.TrabajoFinal.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class GestorBD {

	private final String URL = "jdbc:mysql://localhost:3306/trabajo_integrador"; // ruta de la base de datos
	private final String USUARIO = "root"; // usuario de la base de datos
	private final String CONTRASENA = "admin"; // contraseña de la base de datos

	public GestorBD() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver"); // driver para la conexion en mysql
	}

	
	
	public ArrayList<Persona> listaPersonas() {

		ArrayList<Persona> lista = new ArrayList<Persona>();

		try {

			Connection con = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from persona");

			while (rs.next()) {

				int id = rs.getInt(1);
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
				int edad = rs.getInt(4);

				Persona p = new Persona(id, nombre, apellido, edad);
				lista.add(p);
			}

			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println(e.toString());
		}

		return lista;
	}
	
	
	
	public ArrayList<Pronostico> listaPronosticos() {

		ArrayList<Pronostico> lista = new ArrayList<Pronostico>();

		try {

			Connection con = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from todos_los_pronosticos");

			while (rs.next()) {

				int idPronostico = rs.getInt(1);
				
				Persona persona = new Persona(
						rs.getInt(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5)
						);
				
				int idPartido = rs.getInt(6);
				
				Equipo equipo1 = new Equipo(
						rs.getInt(7),
						rs.getString(8),
						rs.getInt(9)
						);
				
				Equipo equipo2 = new Equipo(
						rs.getInt(10),
						rs.getString(11),
						rs.getInt(12)
						);
				
				int golesEquipo1 = rs.getInt(13);
				int golesEquipo2 = rs.getInt(14);
				
				Ronda ronda = new Ronda(
						rs.getInt(15),
						rs.getInt(16),
						rs.getInt(17),
						rs.getString(18)
						);

				int resultadoPronostico = rs.getInt(19);
				
				Partido partido = new Partido(idPartido, equipo1, equipo2, golesEquipo1, golesEquipo2, ronda);
				
				Pronostico pronostico = new Pronostico(idPronostico, persona, partido, resultadoPronostico);
				
				lista.add(pronostico);
			}

			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			System.out.println(e.toString());
		}

		return lista;
	}
}
