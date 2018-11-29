package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbhelpers.*;


/**
 * Servlet implementation class LocatorServlet
 */
@WebServlet("/locate")
public class LocatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LocatorServlet() {
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
		
		// get the data
		int zipCode = Integer.parseInt(request.getParameter("zipCode"));
		
		String url = "";
		
		if (zipCode == 30677) {
			
			url = "storeLocator2.jsp";
			
		} else if (zipCode == 30014) {
			
			url = "storeLocator3.jsp";
			
		} else if (zipCode == 30052) {
			
			url = "storeLocator4.jsp";
			
		} else {
			
			url = "storeLocator5.jsp";
			
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
