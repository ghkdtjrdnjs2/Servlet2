package com.example.servlet1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example02")
public class ExampleServlet02 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 사용자 요청정보는 request 객체에 담겨있다
		
		// <input type="text" name="irum">
		String irum = request.getParameter("irum");
		
		/* System.out.println();은
		  	class System{
		  	public static PrintWriter out;
		  	}
		  	
		  	System 클래스는 컴퓨터에 해당하는 클래스
		  	출력기능을 System이 직접 구현하는 것이 아니라 자바 객체를 사용
		*/
		
		// 응답 언어 설정 : UTF-8은 전세계 모든 문자를 처리하는 코드
		response.setCharacterEncoding("UTF-8");
		
		// 응답 객체에 담긴 데이터의 형식을 웹브라우저에게 알려준다
		response.setContentType("text/html");
		/*
		 * text/plain : 그냥 글자 (enter key)
		 * text/html : html
		 */
		
		// 백에서 view를 만들어서 프론트로 보내준다
		PrintWriter out = response.getWriter();
		String html = "<html><head></head><body>";
		html += "<div style='color:red;'>당신이름 : " + irum +"</div>";
		html += "</body></html>";
		out.println(html);
	}
}
