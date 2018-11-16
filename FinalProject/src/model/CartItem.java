package model;

import java.io.Serializable;
import java.text.NumberFormat;

import model.Product;

public class CartItem implements Serializable{
	
	private int productID;
	private String description;
	private String imageID;
	private double price;
	private String code;
	private double quantity;
	private double total;
	
	/**
	 * default constructor
	 */
	public CartItem() {
		this.productID = 1234;
		this.description = "";
		this.imageID = "";
		this.price = 0.0;
		this.code = "";
		this.quantity = 0.0;
		this.total = 0.0;

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
			double price, String code, double quantity, double total) {
		this.productID = productID;
		this.description = description;
		this.imageID = imageID;
		this.price = price;
		this.code = code;
		this.quantity = quantity;
		this.total = total;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getTotal() {
        double total = price * quantity;
        return total;
    }

    public String getTotalCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(this.getTotal());
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CartItem [productID=" + productID + ", description=" + description + ", imageID=" + imageID + ", price="
				+ price + ", code=" + code + ", quantity=" + quantity + ", total=" + total + "]";
	}
    
    

}
