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
	
	public ArrayList<Partido> listaPartidos() {

		ArrayList<Partido> lista = new ArrayList<Partido>();

		try {

			Connection con = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from todos_los_partidos");

			while (rs.next()) {

				int idPartido = rs.getInt(1);
				
				Equipo equipo1 = new Equipo(
						rs.getInt(2),
						rs.getString(3),
						rs.getInt(4)
						);
				
				Equipo equipo2 = new Equipo(
						rs.getInt(5),
						rs.getString(6),
						rs.getInt(7)
						);
				
				int golesEquipo1 = rs.getInt(8);
				int golesEquipo2 = rs.getInt(9);
				
				Ronda ronda = new Ronda(
						rs.getInt(10),
						rs.getInt(11),
						rs.getInt(12),
						rs.getString(13)
						);

				Partido p = new Partido(idPartido, equipo1, equipo2, golesEquipo1, golesEquipo2, ronda);
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
}
