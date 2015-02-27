import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SakilaConnection  {
	//"jdbc:mysql://localhost:3306/JDBCDemo"
	private static final String URL = "jdbc:mysql://localhost:3306/Sakila";
	private static final String user = "root";
	private static final String pwd = "root";
	
	public static Connection connect() throws SQLException{
		Connection conn = DriverManager.getConnection(URL, user, pwd);
		System.out.println("Connected to Sakila server...");
		return conn;
	}

}
