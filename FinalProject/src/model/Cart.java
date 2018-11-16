package model;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

import model.CartItem;

public class Cart implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Product> items;

    public Cart() {
        items = new ArrayList<Product>();
    }

    public ArrayList<Product> getItems() {
        return items;
    }

    public int getCount() {
        return items.size();
    }

    public void addItem(Product item) {
        String code = item.getCode();
        for (int i = 0; i < items.size(); i++) {
            Product cartItem = items.get(i);
            if (cartItem.getCode().equals(code)) {
                return;
            }
        }
        items.add(item);
    }

    public void removeItem(Product item) {
        String code = item.getCode();
        for (int i = 0; i < items.size(); i++) {
            Product cartItem = items.get(i);
            if (cartItem.getCode().equals(code)) {
                items.remove(i);
                return;
            }
        }
    }
    
    public String getCartTable() {
    	
    	int size = items.size();
    	String table = "";

    	for (int row = 0; row < items.size() / 3; row++) {
    		
    		Product item = items.get(row);
    		
			table += "<table border=1>";
			
			
			
			table +="<tr>";
			table +="<td>";
			table +=item.getProductID();
			table +="</td>";
			table +="<td>";
			table +=item.getDescription();
			table +="</td>";
			table +="<td>";
			table +=item.getImageID();
			table +="</td>";
			table +="<td>";
			table +=item.getPrice();
			table +="</td>";
			table +="<td>";
			table +=item.getCode();
			table +="</td>";
			table +="</tr>";
			
			table += "</table>";

    	}
		return table;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cart [items=" + items + "]";
	}

}
