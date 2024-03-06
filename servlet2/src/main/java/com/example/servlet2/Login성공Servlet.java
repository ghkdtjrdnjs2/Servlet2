package com.example.servlet2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/success")
public class Login성공Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로그인 여부 확인
		HttpSession session = request.getSession();
		
		// 
		if(session.getAttribute("username")==null) {
			response.sendRedirect("/servlet2/login");
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("로그인성공.jsp");
			rd.forward(request, response);	
		}
	}
}
