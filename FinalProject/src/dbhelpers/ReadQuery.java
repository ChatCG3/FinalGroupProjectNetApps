package dbhelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Product;
import model.Customer;



/**
 * @author codygreen
 *
 */
public class ReadQuery {
	
	private Connection connection;
	private ResultSet results;
	
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
	
	public String getProductTable() {
		String table = "";
		table += "<table border=1>";
		
		try {
			while(this.results.next()) {
				Product product = new Product();
				product.setProductID(this.results.getInt("productID"));
				product.setDescription(this.results.getString("description"));
				product.setImageID(this.results.getInt("imageID"));
				
				table +="<tr>";
				table +="<td>";
				table +=product.getProductID();
				table +="</td>";
				table +="<td>";
				table +=product.getDescription();
				table +="</td>";
				table +="<td>";
				table +=product.getImageID();
				table +="</td>";
				table +="<td>";
					table +="<a href=Add To Cart?id=" + product.getProductID() + ">Add To Cart</a>";
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
