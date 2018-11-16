package model;

import java.io.Serializable;
import java.util.ArrayList;

import model.CartItem;

public class Cart implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<CartItem> items;

    public Cart() {
        items = new ArrayList<CartItem>();
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public int getCount() {
        return items.size();
    }

    public void addItem(CartItem item) {
        String code = item.getProduct().getCode();
        int quantity = item.getQuantity();
        for (int i = 0; i < items.size(); i++) {
            CartItem cartItem = items.get(i);
            if (cartItem.getProduct().getCode().equals(code)) {
                cartItem.setQuantity(quantity);
                return;
            }
        }
        items.add(item);
    }

    public void removeItem(CartItem item) {
        String code = item.getProduct().getCode();
        for (int i = 0; i < items.size(); i++) {
            CartItem cartItem = items.get(i);
            if (cartItem.getProduct().getCode().equals(code)) {
                items.remove(i);
                return;
            }
        }
    }

}
