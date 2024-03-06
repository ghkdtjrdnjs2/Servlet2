package com.example.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example07")
public class ExampleServlet07 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = "석원";
		Long nai = 30L;
		request.setAttribute("name", name);
		request.setAttribute("nai", nai);
		RequestDispatcher rd =
				request.getRequestDispatcher("example7.jsp");
		rd.forward(request, response);
	}
}
