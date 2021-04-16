package web_basic_jsp_10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.tools.DocumentationTool.Location;

@WebServlet("/jsp_10/partUploadProl")
@MultipartConfig(
		fileSizeThreshold = 0,
		location = "D:/upload"
		)
public class PartUploadProlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public PartUploadProlServlet() {
		super();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			request.setCharacterEncoding("UTF-8");
			String writer = request.getParameter("writer");
			Part part = request.getPart("partFile1");
			response.setContentType("text/html;charset=UTF-8");
		
			PrintWriter out = response.getWriter();
			
			System.out.printf("writer = %s, part =%s%n", writer, part.getSubmittedFileName());
			System.out.printf("size = %s%n", part.getSize());
			System.out.printf("getContentType() =  %s%n", part.getContentType());
			System.out.printf("getName() = %s%n", part.getName());
			
			String uploadFIleName = part.getSubmittedFileName();
			part.write(uploadFIleName);
			out.printf("작성자 : %s 님이 %s  파일을 업로드 하였습니다." , writer , uploadFIleName + " ");
			
	}


}
