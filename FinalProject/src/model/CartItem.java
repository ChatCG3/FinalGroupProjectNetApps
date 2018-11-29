package model;

import java.text.NumberFormat;


public class CartItem {
	
	/**
	 * 
	 */
	
	private int productID;
	private String description;
	private String imageID;
	private double price;
	private double quantity;
	
	/**
	 * default constructor
	 */
	public CartItem() {
		this.productID = 1234;
		this.description = "";
		this.imageID = "";
		this.price = 0.0;
		this.quantity = 0.0;
	}

	/**
	 * @param productID
	 * @param color
	 * @param numInStock
	 * @param description
	 * @param imageID
	 * @param size
	 */
	public CartItem(int productID, String description, String imageID, 
			double price, double quantity) {
		this.productID = productID;
		this.description = description;
		this.imageID = imageID;
		this.price = price;
		this.quantity = quantity;
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
	public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getTotalCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.price);
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CartItem [productID=" + productID + ", description=" + description + ", imageID=" + imageID + ", price="
				+ price + ", quantity=" + quantity + "]";
	}

    
    

}
