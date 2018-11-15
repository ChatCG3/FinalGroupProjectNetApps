package controllers;

import dbhelpers.Validator;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ValidationServlet
 */
@WebServlet({ "/ValidationServlet", "/validate"})
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get input and validate
		String msg = "";
		String url = "/registerCustomer";
		// username <= 15 characters
		String username = request.getParameter("username");
		if (!Validator.isUsername(username)){
			msg += "A username has not been entered.<br />";
			url = "/inputErrors.jsp";
		} else {
		    request.setAttribute("username", username);
		}
		
		String password = request.getParameter("password");
		if (!Validator.isPassword(password)){
			msg += "A password has not been entered.<br />";
			url = "/inputErrors.jsp";
		} else if (!Validator.isLongPassword(password)){
			msg += "Your password should be greater than 8 characters.<br />";
			url = "/inputErrors.jsp";
		} else {
		    request.setAttribute("password", password);
		}
		
		request.setAttribute("msg", msg);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
