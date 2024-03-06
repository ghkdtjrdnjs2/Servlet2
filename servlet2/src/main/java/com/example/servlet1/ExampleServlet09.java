package com.example.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example9")
public class ExampleServlet09 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd= request.getRequestDispatcher("start9.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long val1 = Long.parseLong(request.getParameter("val1"));
		Long val2 = Long.parseLong(request.getParameter("val2"));
		Long result = val1*val2;
		
		request.setAttribute("result", result);
		RequestDispatcher rd= request.getRequestDispatcher("result9.jsp");
		rd.forward(request, response);
	}
}
