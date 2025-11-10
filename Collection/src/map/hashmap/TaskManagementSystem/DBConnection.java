package map.hashmap.TaskManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
	public static Connection connection() throws SQLException
	{
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "chetan", "India4599");
		return conn;
	}
}
