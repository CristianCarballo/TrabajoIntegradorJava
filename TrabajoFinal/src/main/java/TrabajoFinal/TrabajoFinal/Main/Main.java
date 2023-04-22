package TrabajoFinal.TrabajoFinal.Main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String... param) throws ClassNotFoundException {

		Connection conectar = null;
		String url = "jdbc:mysql://localhost:3306/trabajo_integrador"; // ruta de la base de datos
		Class.forName("com.mysql.cj.jdbc.Driver"); // driver para la conexion en mysql
		
		try {
			
			conectar = DriverManager.getConnection(url, "root", "admin"); // "root" es el usuario, "admin" es la contraseña
			System.out.println("exito"); // si hay conexion muestro por consola
			
		} catch (SQLException e) {
			System.out.println(e.toString()); // si no hay conexion muestro el error por consola
		}

		try {

			Statement s;

			ResultSet rs;

			s = conectar.createStatement();

			rs = s.executeQuery("select * from persona");
			
			while(rs.next()) {
				
				int id = rs.getInt(1);
				String nombre = rs.getString(2);
				String apellido = rs.getString(3);
				int edad = rs.getInt(4);
				
				Persona p = new Persona(id, nombre, apellido, edad);
				System.out.println(p);
				
			}

		} catch (SQLException e) {
			System.out.println(e.toString());
		}
	}
}