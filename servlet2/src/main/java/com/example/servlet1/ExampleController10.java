package com.example.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// jsp : html+자바

// M : Model - 데이터
// V : View - 데이터를 출력하는 화면(현재는 jsp)
// C : Controller - 사용자 요청을 접수하고(url) 적당한 뷰와 연결
// MVC와 같은 말 == model2

@WebServlet("/example10")
public class ExampleController10 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// forward : jsp 화면을 보여준다
		//			 주소는 그대로 -> 같은 작업, 기존 작업이 계속 된다
		RequestDispatcher rd= request.getRequestDispatcher("input10.jsp");
		rd.forward(request, response);
	}	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 처리 결과를 보여주거나... (다른 곳으로 이동)
		// redirect : 주소가 바뀐다, 새로운 작업을 시작한다
		Long val1 = Long.parseLong(request.getParameter("val1"));
		Long val2 = Long.parseLong(request.getParameter("val2"));
		Long result = val1 * val2;
		
		request.setAttribute("result", result); // 위에 result 결과를 보내는 방법
		RequestDispatcher rd= request.getRequestDispatcher("result10.jsp");
		rd.forward(request, response);
	}
}
