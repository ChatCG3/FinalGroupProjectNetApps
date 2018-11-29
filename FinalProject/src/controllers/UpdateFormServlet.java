package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.ReadRecord;
import model.*;

/**
 * Servlet implementation class UpdateFormServlet
 */
@WebServlet("/update")
public class UpdateFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFormServlet() {
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
		// get the productID
		int productID = Integer.parseInt(request.getParameter("productID"));
		
		//create ReadRecord class
		ReadRecord rr = new ReadRecord("naproject", "root", "toortoor", productID);
		
		// Use ReadRecord to get the product data
		rr.doRead();
		
		Product product = rr.getProduct();
		
		// pass Product and control to the updateForm.jsp
		request.setAttribute("product", product);
		
		String url = "/updateForm.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
