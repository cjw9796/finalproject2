package com.kh.ajax;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// AjaxInsert ,AjaxSearch 
// 서블릿을 사용할 수 있게 세팅하기 
// 한글깨짐 보낼때 받을 떄 

// index.jsp 에서 입력한 데이터가 ajax통해서 넘오는 데이터를 받는다.

@WebServlet("/AjaxInsert")
public class AjaxInsert extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		actionDo(req,resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		actionDo(req,resp);
	}
	
	protected void actionDo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("AjaxInsert서블릿의 actionDo() 메서드 실행 ");
		
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html; charset=UTF-8");
		
		// insert.jsp 에서 입력한 데이터가 ajax를 통해서 넘어오는 데이터를 받는다.
		String name = req.getParameter("name").trim();
		int age = Integer.parseInt(req.getParameter("age").trim());
		String gender = req.getParameter("gender");
		String email = req.getParameter("email").trim();
		
		// 넘겨받은 데이터를 AjaxDTO 클래스 객체에 저장 한다.
		AjaxDTO vo = new AjaxDTO(name,age,gender,email);
		
		// 넘겨받은 데이터를 테이블에 저장하는 메서드를 실행한다. 
		int result = new AjaxDAO().insert(vo);
		
		// write() 메서드는 인수로 문자열만 가질 수 있으므로 공백을 붙여서 
		// 문자열로 리턴한다. 
		
		resp.getWriter().write(result + "");
		
	}	
}






