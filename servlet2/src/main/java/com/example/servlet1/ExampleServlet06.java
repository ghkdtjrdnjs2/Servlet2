package com.example.servlet1;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example06")
public class ExampleServlet06 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hello = "안녕하세요";
		
		// 이 문자열을 jsp에 넘겨주자
		// 어떻게 넘겨주느냐 : request에 담아서
		request.setAttribute("hello", hello);
		// jsp에 넘기자
		RequestDispatcher rd=
				request.getRequestDispatcher("example6.jsp");
		// forward 중요도!!!!!!!!!!!!!!
		// 서블릿에서 jsp로 이동 : 주소는 바뀌지 않는다
		rd.forward(request, response);
		// 웹은 request가 떠나는 여행이다 
		// 여러 작업을 거치고(데이터를 담고) 사용자에게 보여주는 순간
		// request의 여행이 끝난다(죽는다)
	}
}
