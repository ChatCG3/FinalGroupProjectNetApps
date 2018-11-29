package model;

/**
 * @author codygreen
 *
 */
public class Product {
	
	private int productID;
	private String description;
	private String imageID;
	private double price;
	
	/**
	 * default constructor
	 */
	public Product() {
		this.productID = 1234;
		this.description = "";
		this.imageID = "";
		this.price = 0.0;
	}

	public Product(int productID, String description, String imageID, double price) {
		this.productID = productID;
		this.description = description;
		this.imageID = imageID;
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
	public String getImageID() {
		return imageID;
	}

	/**
	 * @param imageID the imageID to set
	 */
	public void setImageID(String imageID) {
		this.imageID = imageID;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", description=" + description + ", imageID=" + imageID + ", price="
				+ price + "]";
	}

	

	
}

