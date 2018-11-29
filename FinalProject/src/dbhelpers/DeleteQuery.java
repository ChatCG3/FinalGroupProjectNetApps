package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteQuery {
	
	private Connection connection;
	
	public DeleteQuery(String dbName, String uname, String pwd) {
		
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException 
				| ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doDelete(int productID) {
		// set up a String to hold our query
		String query = "delete from cart where productID = ?";
		
		// create a preparedstatement using our query string
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			// fill in the preparedstatement
			ps.setInt(1, productID);
		
			// execute the query
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
