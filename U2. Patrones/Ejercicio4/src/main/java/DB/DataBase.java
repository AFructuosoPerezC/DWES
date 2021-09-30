package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {	
	private static Connection con = null;
	
	// El constructor es privado, no permite que se genere un constructor por defecto.
    private static Connection connection() {
    	try {
    		Class.forName("com.mysql.jdbc.Driver");
    		
    		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","");
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
    	return con;
    }
    
    public static Connection getConnection() {
    	if(con == null) {
    		con = connection();
    	}
    	
    	return con;
    }
}