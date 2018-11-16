package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.*;

public class AddCart {
	
	public Connection connection;
	
	public AddCart(String dbName, String uname, String pwd) {
		
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void doAdd(CartItem cartItem) {
		String query = "insert into cart (productID, description, imageID, price, code, quantity, total) values (?, ?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement ps = connection.prepareStatement(query);
			
			ps.setInt(1, cartItem.getProductID());
			ps.setString(2, cartItem.getDescription());
			ps.setString(3, cartItem.getImageID());
			ps.setDouble(4, cartItem.getPrice());
			ps.setString(5, cartItem.getCode());
			ps.setDouble(6, cartItem.getQuantity());
			ps.setDouble(6, cartItem.getTotal());

			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
