package web_basic_jsp_13.erp;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/jsp_13/titleupdate")
public class TitleUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private TitleService service;
	
       
    public TitleUpdateServlet() {
    	service=new TitleService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response)
			throws UnsupportedEncodingException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		int tNo = Integer.parseInt(request.getParameter("titleNo").trim());
		String tName = request.getParameter("titleName").trim();
		 
		Title title = new Title(tNo, tName);
		service.modifyTitle(title);
		
		response.sendRedirect("/web_basic/TitleServlet");
	}

}
