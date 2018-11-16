/**
 * 
 */
package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;

/**
 * @author codygreen
 *
 */
public class ReadCustomerRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private Customer customer = new Customer();
	private String username;
	
	public ReadCustomerRecord(String dbName, String uname, String pwd, String username) {
		
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		this.username = username;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doRead() {
		String query = "select * from customers where username = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setString(1, this.username);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			customer.setId(this.results.getInt(1));
			customer.setUsername(this.results.getString("username"));
			customer.setPassword(this.results.getString("password"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Customer getCustomer() {
		return this.customer;
	}

}
