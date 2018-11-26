package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.*;




/**
 * @author codygreen
 *
 */
public class ReadQuery {
	
	private Connection connection;
	private ResultSet results;
	
	private Product product = new Product();
	private String code;
	
	public ReadQuery(String dbName, String uname, String pwd) {
		String url = "jdbc:mysql://localhost:3306/" + dbName + "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doReadProduct() {
		String query = "select * from product";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doReadCustomer() {
		String query = "select * from customers";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void doReadCart() {
		String query = "select * from cart";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Product doReadProductRecord(String code) {
		
		
		String query = "select * from product where code= ?";
		
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			
			ps.setString(1, this.code);

			
			this.results = ps.executeQuery();
			
			this.results.next();
			
			product.setProductID(this.results.getInt("productID"));
			product.setDescription(this.results.getString("description"));
			product.setImageID(this.results.getString("imageID"));
			product.setPrice(this.results.getDouble("price"));
			product.setCode(this.results.getString("code"));


		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.product;
		
		
	}

	
	public String getProductTable() {
		String table = "";
		table += "<table border=1>";
		
		try {
			while(this.results.next()) {
				Product product = new Product();
				product.setProductID(this.results.getInt("productID"));
				product.setDescription(this.results.getString("description"));
				product.setImageID(this.results.getString("imageID"));
				product.setPrice(this.results.getDouble("price"));
				product.setCode(this.results.getString("code"));


				
				table +="<tr>";
				table +="<td>";
				table +=product.getProductID();
				table +="</td>";
				table +="<td>";
				table +=product.getDescription();
				table +="</td>";
				table +="<td>";
				table +="<img src= 'images/" + product.getImageID() + " 'width='450' height='250' />";
				table +="</td>";
				table +="<td>";
				table +=product.getPrice();
				table +="</td>";
				table +="<td>";
				table +=product.getCode();
				table +="</td>";
				table +="<td>";
					table +="<a href=addToCart?productID=" + product.getProductID() + ">Add to Cart</a>";
				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";

		
		return table;
	}
	
	public String getCartTable() {
		String table = "";
		table += "<table border=1>";
		
		try {
			while(this.results.next()) {
				CartItem cartItem = new CartItem();
				cartItem.setProductID(this.results.getInt("productID"));
				cartItem.setDescription(this.results.getString("description"));
				cartItem.setImageID(this.results.getString("imageID"));
				cartItem.setPrice(this.results.getDouble("price"));
				cartItem.setCode(this.results.getString("code"));


				
				table +="<tr>";
				table +="<td>";
				table +=cartItem.getProductID();
				table +="</td>";
				table +="<td>";
				table +=cartItem.getDescription();
				table +="</td>";
				table +="<td>";
				table +=cartItem.getImageID();
				table +="</td>";
				table +="<td>";
				table +=cartItem.getPrice();
				table +="</td>";
				table +="<td>";
				table +=cartItem.getCode();
				table +="</td>";
				table +="<td>";
					table +="<a href=delete?id=" + cartItem.getProductID() + ">Remove from Cart</a>";
				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";

		
		return table;
	}
	
	
	
	public String getCustomerTable() {
		String table = "";
		table += "<table border=1>";
		
		try {
			while(this.results.next()) {
				Customer customer = new Customer();
				customer.setId(this.results.getInt("id"));
				customer.setUsername(this.results.getString("username"));
				customer.setPassword(this.results.getString("password"));
				
				table +="<tr>";
				table +="<td>";
				table +=customer.getUsername();
				table +="</td>";
				table +="<td>";
				table +=customer.getPassword();
				table +="</td>";
				table +="<td>";
					table +="<a href=update?id=" + customer.getId() + ">update</a> <a href=delete?id=" + customer.getId() + ">delete</a>";
				table +="</td>";
				table +="</tr>";
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		table += "</table>";

		
		return table;
	}

}
