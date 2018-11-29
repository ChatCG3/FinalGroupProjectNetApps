package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.DeleteQuery;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet(
		description = "Controller for removing items from cart", 
		urlPatterns = { 
				"/DeleteServlet", 
				"/delete"
		})
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
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
		// get the bookID
		int productID = Integer.parseInt(request.getParameter("productID"));
		
		// create a deleteQuery object
		DeleteQuery dq = new DeleteQuery("naproject", "root", "toortoor");
		
		// use deleteQuery to delete the record
		dq.doDelete(productID);
		
		// pass execution on to the CartController
		String url = "/CartController";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
