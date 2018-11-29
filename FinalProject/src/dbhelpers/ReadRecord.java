/**
 * 
 */
package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.*;

public class ReadRecord {
	
	private Connection connection;
	private ResultSet results;
	
	private Product product = new Product();
	private int productID;
	
	public ReadRecord(String dbName, String uname, String pwd, int productID) {
		
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
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
			product.setDescription(this.results.getString("description"));
			product.setImageID(this.results.getString("imageID"));
			product.setPrice(this.results.getDouble("price"));
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Product getProduct() {
		return this.product;
	}

}
