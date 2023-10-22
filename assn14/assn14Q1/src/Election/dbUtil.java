package Election;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbUtil {

	public static final String DB_DRIVER= "com.mysql.cj.jdbc.Driver";
	public static final String DB_URL = "jdbc:mysql://localhost:3306/mydatabase";
	//mydatabse = you db name
	public static final String DB_USER = "kd3_80081_naveen";
	public static final String DB_PASSWRD= "manager";
	
	static  {
		try {//
			Class.forName(DB_DRIVER);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
			System.exit(1);// if the driver not found or connect then we don't want
			//to procede further that is why if driver not found then exit program.
		}
	}
	
	
	
	public static Connection getConnection() throws SQLException {
		Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWRD);
		return con;
	}
	
	
}
