package com.example.servlet1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/example03")
public class ExampleServlet03 extends HttpServlet {
	// 객체를 저장할 때 읽어올 때 클래스를 구별하기 위한 번호
	// 이 문법 거의 안쓴다 -> 스카웃(스타크래프트) 같은 존재
	// private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// getParameter()로 꺼내면 무조건 문자열
		// Integer a = request.getParameter("a"); <- 이렇게 쓰면 오류
		
		// 문자열을 숫자로 바꾸기
		String str = request.getParameter("a");
		// str은 null
		//!!!!!!!!!! 어떤 객체가 null인 것은 오류가 아니다 !!!!!!!!!!
		System.out.println(str);
		
		// !!!!!!!!!!!!! null인 객체를 사용하는 것이 오류 !!!!!!!!!!!
		Integer a= Integer.parseInt(str);
		System.out.println(a);
	}
}
