package model;

/**
 * @author codygreen
 *
 */
public class Product {
	
	private int productID;
	private String description;
	private int imageID;
	private double price;
	private String code;
	
	/**
	 * default constructor
	 */
	public Product() {
		this.productID = 1234;
		this.description = "";
		this.imageID = 0;
		this.price = 0.0;
		this.code = "";
	}

	/**
	 * @param productID
	 * @param color
	 * @param numInStock
	 * @param description
	 * @param imageID
	 * @param size
	 */
	public Product(int productID, String description, int imageID, double price, String code) {
		this.productID = productID;
		this.description = description;
		this.imageID = imageID;
		this.price = price;
		this.code = code;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the productID
	 */
	public int getProductID() {
		return productID;
	}

	/**
	 * @param productID the productID to set
	 */
	public void setProductID(int productID) {
		this.productID = productID;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the imageID
	 */
	public int getImageID() {
		return imageID;
	}

	/**
	 * @param imageID the imageID to set
	 */
	public void setImageID(int imageID) {
		this.imageID = imageID;
	}

	/**
	 * @return the size
	 */
	
	
	
	
	
}

