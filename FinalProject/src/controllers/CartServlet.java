package controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.*;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet(
		description = "Controller for reading the cart", 
		urlPatterns = { 
				"/CartServlet", 
				"/cart"
		})
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		// Create a ReadQuery helper object
		ReadQuery rq = new ReadQuery("naproject", "root", "toortoor");
		
		// Get the html table from the ReadQuery object
		rq.doReadCart();
		String table = rq.getCartTable();
		
		// pass execution control to read.jsp along with the table
		request.setAttribute("table", table);
		String url = "/cart.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
				
	}

}
