package com.example.servlet1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.entity.Product;

@WebServlet("/example05")
public class ExampleServlet05 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		Long price = Long.parseLong(request.getParameter("price"));
		
		Product p = new Product(name,price);
		
		String html = "<html><head></head><body><ul>";
		html += "<li>"+ p.getName()+"</li>";
		html += "<li>"+ p.getPrice()+"</li>";
		html += "</ul></body></html>";
		
		response.getWriter().print(html);
		// 위 코드가 사용하기 불편하기 때문에 templete생겼다
		// templete : html과 자바코드를 함께 작성할 수 있는 무언가
		
	}
}
