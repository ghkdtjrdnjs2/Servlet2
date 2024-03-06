package com.example.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 사용자가 숫자 2개를 입력하면 더해서 결과를 출력하자
// 서블릿에서 get : 입력화면으로 forward
// 서블릿에서 post : 처리 결과화면으로 forward 또는 다른 작업으로 redirect

@WebServlet("/example8")
public class ExampleServlet08 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd= request.getRequestDispatcher("start8.jsp");
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Long val1 = Long.parseLong(request.getParameter("val1"));
		Long val2 = Long.parseLong(request.getParameter("val2"));
		Long result = val1+ val2;
		
		request.setAttribute("result", result);
		RequestDispatcher rd= request.getRequestDispatcher("result8.jsp");
		rd.forward(request, response);
	}
}
