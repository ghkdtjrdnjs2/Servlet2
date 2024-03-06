package com.example.servlet2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/aaa")
public class AAAServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("data1", "요청 데이터입니다");
		
		HttpSession session = request.getSession();
		session.setAttribute("data2", "세션 데이터입니다");
		
		response.sendRedirect("/servlet2/bbb");
		
		// 여기서 forward를 한다면 jsp에서 data1, data2 모두 출력가능하다
		// ${data1}, ${data2}
		// jsp는 ${data1}이라고 하면 우선 request에서 찾는다 -> 있다 ->출력
		// ${data2}의 경우 request에서 찾는다 -> 없다 -> 
		// 그러면 session에서 찾는다
		
		// 세션유지시간
		// session.setMaxInactiveInterval(3600);
		// 세션 파괴 - 로그아웃 처리
		// session.invalidate();
	}
}
