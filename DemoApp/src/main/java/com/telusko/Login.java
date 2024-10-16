package com.telusko;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDao;

@WebServlet("/login")
public class Login extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uname = req.getParameter("uname");
		String pass = req.getParameter("pass");
		
		HttpSession sess = req.getSession();
		sess.setAttribute("username", uname);
		sess.setAttribute("password", pass);
		
		
		
		/*
		 * if (uname.equals("t") && pass.equals("l"))
		 * 
		 * resp.sendRedirect("welcome.jsp"); 
		 * else 
		 * resp.sendRedirect("login.jsp");
		 */
		
		LoginDao dao = new LoginDao();
		if (dao.check(uname, pass))
			resp.sendRedirect("welcome.jsp"); 
		else 
			resp.sendRedirect("login.jsp");
	}
}
