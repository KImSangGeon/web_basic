package web_basic_jsp_04;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ch04/selectServlet")
public class RegisterServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		String id = request.getParameter("id");
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		String file = request.getParameter("file");
		String color = request.getParameter("color");
		String classc = request .getParameter("classc");
		String subject = request.getParameter("subject");
		
		String subj = request.getParameter("subj");
		String intro = request.getParameter("intro");
		String subs = intro.replace("\r\n", "<br>");			

		PrintWriter out = response.getWriter();
		
		out.printf("<html>수강정보<br>");
		out.printf("id %s<br>", id);
		out.printf("passwd %s<br>", passwd);
		out.printf("name %s<br>", name);		
		out.printf("file %s<br>", file);
		out.printf("color %s<br>", color);
		String t = null;
		if (classc.equals("archi")) {
			t = "건축공학과";
		}if (classc.equals("mechanic")) {
			t = "기계공학과";
		}if (classc.equals("indust")) {
			t = "산업공학과";
		}if(classc.equals("elec")) {
			t= "전기전자공학과";
		}if(classc.equals("computer")) {
			t= "컴퓨터공학과";
		}if(classc.equals("chemical")) {
			t= "화학공학과";
		}if(classc.equals("history")) {
			t= "사학부";
		}if(classc.equals("lang")) {
			t="어문학부";
		}if(classc.equals("philo")) {
			t="철학";
		}
		out.printf("과목 %s" , t);
		out.printf("<br>");
		out.printf("하고싶은 말%s <br>", subs);
		
		out.printf("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		process(request, response);
	}

}
