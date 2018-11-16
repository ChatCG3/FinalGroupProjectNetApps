package controllers;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.*;
import database.*;
import dbhelpers.*;



/**
 * Servlet implementation class CartServlet
 */
@WebServlet(
		description = "Controller for cart", 
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
    
	@Override
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
			ServletContext sc = getServletContext();
	        
			String code = request.getParameter("code");
			
			Product product = new Product();
			
			String url = "/cart.jsp";
	        
	
	        HttpSession session = request.getSession();
	        Cart cart = (Cart) session.getAttribute("cart");
            if (cart == null) {
                cart = new Cart();
            }


            ReadQuery rd = new ReadQuery("naproject", "root", "toortoor");
            product = rd.doReadProductRecord(code);;

            cart.addItem(product);
            
            String currentCart = cart.getCartTable();

            session.setAttribute("cart", cart);
            session.setAttribute("currentCart", currentCart);
            
//            url = "/cart.jsp";
//        }
//        else if (action.equals("checkout")) {
//            url = "/checkout.jsp";
//        }

        sc.getRequestDispatcher(url)
                .forward(request, response);
    }

}
