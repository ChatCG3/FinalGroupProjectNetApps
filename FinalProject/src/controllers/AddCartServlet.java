package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.*;
import model.*;

/**
 * Servlet implementation class AddCartServlet
 */
@WebServlet({ "/AddCartServlet", "/addCart" })
public class AddCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get the data
		int productID = Integer.parseInt(request.getParameter("productID"));
		String description = request.getParameter("description");
		String imageID = request.getParameter("imageID");
		double price = Double.parseDouble(request.getParameter("price"));
		double quantity = Double.parseDouble(request.getParameter("quantity"));
		double total = Double.parseDouble(request.getParameter("total"));
		 
		
		// set up a book object
		CartItem cartItem = new CartItem();
		cartItem.setProductID(productID);
		cartItem.setDescription(description);
		cartItem.setImageID(imageID);
		cartItem.setPrice(price);
		cartItem.setQuantity(quantity);
		cartItem.setTotal(total);
		
		// set up an addQuery object
		AddCart ac = new AddCart("naproject", "root", "toortoor");
		
		// pass the book to addQuery to add to the database
		ac.doAdd(cartItem);
		
		// pass execution control to the ReadServlet
		String url = "/CartController";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
