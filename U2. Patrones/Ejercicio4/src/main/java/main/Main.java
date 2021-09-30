package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DB.DataBase;


public class Main {
	public static void main(String[] args) {
		Connection con = DataBase.getConnection();
		PreparedStatement consulta;
		ResultSet resultado;
		
		try {
			// Otros y operaciones sobre la base de datos...
			consulta = con.prepareStatement("SELECT * FROM payments");
			resultado = consulta.executeQuery();
			
			while(resultado.next()){
				System.out.println(resultado.getString(1) + " "
						+ resultado.getString(2));
			}

			con.close();
		} catch (SQLException ex) {
			// Mantener el control sobre el tipo de error
			System.out.println("SQLException: " + ex.getMessage());
		}
	}
}