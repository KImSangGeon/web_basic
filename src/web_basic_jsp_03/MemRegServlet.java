package web_basic_jsp_03;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp_03/memReg")
public class MemRegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out = response.getWriter();
		if(request.getMethod().equals("GET")) {
//			 doGet(request, response);			 
			 
				out.printf("get method call" );
		 }else {
//			 doPost(request, response);
				out.printf("post method call" );
		 }
		 
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
		

	}
	private void process(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, IOException {
		request.setCharacterEncoding("UTF-8");			//request가 utf아님 그래서 먼저 셋팅해야함
		response.setContentType("text/html; charset=utf-8");
		
		if(request.getMethod().equalsIgnoreCase("GET")) {
			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			out.println("이름 = "  + name + "<br> " );
		}else {			
			PrintWriter out = response.getWriter();
			String name = request.getParameter("name");
			String addr = request.getParameter("addr");
			String tel = request.getParameter("tel");
			String hobby = request.getParameter("hobby");
			
			out.println("이름 = "  + name + "<br> " );
			out.println("주소 = "  + addr + "<br> " );
			out.println("전화번호 = "  + tel + "<br> " );
			out.println("취미 = "  + hobby + "<br> " );
			
		}
				
			
			
	
	}

}
