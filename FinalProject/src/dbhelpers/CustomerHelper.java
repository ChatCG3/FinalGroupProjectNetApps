package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Customer;
import model.Product;

/**
 * This class is used to insert, retrieve, and update users in the user table.
 */
public class CustomerHelper {
	
	private Connection connection;
	private ResultSet results;
	
	private Customer customer = new Customer();
	private int id;
	
	/**
	 * Prepared SQL statement (combats: SQL Injections)
	 */
	private PreparedStatement authenticateCustomerStatement; 
		
	/**
	 * Constructor which makes a connection
	 */
	public CustomerHelper(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		
		try {
			//Set up connection
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url, uname, pwd);
			
			//Create the preparedstatement(s)
			authenticateCustomerStatement = conn.prepareStatement("select * from customers where username=? and password=?");
		} catch (Exception e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
	
	/**
	 * Authenticates a user in the database.
	 * @param username  The username for the user.
	 * @param password  The password for the user.
	 * @return A user object if successful, null if unsuccessful.
	 */
	public Customer authenticateCustomer(String username, String password) {
		Customer customer = null;
		try {
			//Add parameters to the ?'s in the preparedstatement and execute
			authenticateCustomerStatement.setString(1, username);
			authenticateCustomerStatement.setString(2, password);
			ResultSet rs = authenticateCustomerStatement.executeQuery();
			
			//if we've returned a row, turn that row into a new user object
			if (rs.next()) {
				customer = new Customer(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
			}
		} catch (SQLException e) {
			System.out.println(e.getClass().getName() + ": " + e.getMessage());
		}
		return customer;
	}
}
