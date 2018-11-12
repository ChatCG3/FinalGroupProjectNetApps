package model;

/**
 * @author codygreen
 *
 */
public class Product {
	
	private int productID;
	private String color;
	private int numInStock;
	private String description;
	private int imageID;
	private String size;
	
	/**
	 * default constructor
	 */
	public Product() {
		this.productID = 1234;
		this.color = "";
		this.numInStock = 0;
		this.description = "";
		this.imageID = 0;
		this.size = "";
	}

	/**
	 * @param productID
	 * @param color
	 * @param numInStock
	 * @param description
	 * @param imageID
	 * @param size
	 */
	public Product(int productID, String color, int numInStock, String description, int imageID, String size) {
		this.productID = productID;
		this.color = color;
		this.numInStock = numInStock;
		this.description = description;
		this.imageID = imageID;
		this.size = size;
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
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the numInStock
	 */
	public int getNumInStock() {
		return numInStock;
	}

	/**
	 * @param numInStock the numInStock to set
	 */
	public void setNumInStock(int numInStock) {
		this.numInStock = numInStock;
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
	public String getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(String size) {
		this.size = size;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", color=" + color + ", numInStock=" + numInStock + ", description="
				+ description + ", imageID=" + imageID + ", size=" + size + "]";
	}
	
	
	
	
}

