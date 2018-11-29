package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.UpdateQuery;
import model.*;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet("/updateProduct")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int productID = Integer.parseInt(request.getParameter("productID"));
		String description = request.getParameter("description");
		String imageID = request.getParameter("imageID");
		double price = Double.parseDouble(request.getParameter("price"));
		double quantity = Double.parseDouble(request.getParameter("quantity"));
		
		 
		// set up a CartItem object
		CartItem cartItem = new CartItem();
		cartItem.setProductID(productID);
		cartItem.setDescription(description);
		cartItem.setImageID(imageID);
		cartItem.setPrice(price);
		cartItem.setQuantity(quantity);
		
		// create an UpdateQuery object and use it to update the book
		UpdateQuery uq = new UpdateQuery("naproject", "root", "toortoor");
		uq.doUpdate(cartItem);
		
		// pass control on to the ReadServlet
		String url = "/CartController";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
