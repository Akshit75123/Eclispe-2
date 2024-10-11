package com.telusko;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/JSTLServlet")
public class JSTLServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = "akshit";
		
		/* Student s = new Student(1,"panwar"); */
		
		List<Student> list = Arrays.asList(new Student(1,"akshit"),new Student(2,"vipin"),new Student(3,"vibha"));
		
		
		req.setAttribute("students",list);
		RequestDispatcher rd = req.getRequestDispatcher("display.jsp");
		rd.forward(req, resp);
	}
}

