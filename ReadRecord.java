/**
 * 
 */
package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Book;

/**
 * @author Devin
 *
 */
public class ReadRecord {

	private Connection connection;
	private ResultSet results;
	
	private Product product = new Product();
	private int productID;
	
	public ReadRecord(String dbName, String uname, String pwd, int productID) {
		
		String url="jdbc:mysql://loaclhost:3306/";
		this.productID = productID;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
			
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void doRead() {
		
		String query = "select * from product where productID = ?";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, this.productID);
			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			product.setProductID(this.results.getInt(1));
			product.setSize(this.results.getString("size"));
			product.setColor(this.results.getString("color"));
			product.setQuantity(this.results.getInt("productQuantity"));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Product getProduct() {
		
		return this.product;
		
	}
	
	
	
}
