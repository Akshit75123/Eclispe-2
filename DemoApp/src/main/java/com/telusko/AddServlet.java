//Basic servlet 
package com.telusko;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/add")
public class AddServlet extends HttpServlet  {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		//System.out.println("result is " +k); */
		
		 //PrintWriter out = res.getWriter(); 
		 //out.println("result is "+k);
		 
		//req.setAttribute("k", k); /* request is carrying the value of k */
		//RequestDispatcher -- shifting control to SqServlet
		// RequestDispatcher rd = req.getRequestDispatcher("/sq"); */
		//rd.forward(req, res);
		
		//next tutorial
		
		 //System.out.println("sq called"); 
		 //res.sendRedirect("/sq");
		 
		
		//Session Management
		//HttpSession session = req.getSession();
		//session.setAttribute("k", k);
		
		//res.sendRedirect("sq");
		
		//Cookies
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		
		res.sendRedirect("sq");
	}
}
