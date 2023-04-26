package jspchap1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NowSevlet
 */
@WebServlet("/NowServlet") // NowServlet이라는 요청이 들어오면 나를 호출해
public class NowServlet extends HttpServlet { // Servlet 객체 상속 받음?
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //get 방식 요청시 호출되는 메서드
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		//request  : 요청객채 => 브라우저에서 요청된 정보
		//response : 응답객체 => 브라우저에 전달할 응답 정보  
		response.setContentType("text/html; charset=UTF-8");
		Date now = new Date();
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>현재시간</title></head><body>");
		out.println(now);
		out.println("</body></html>");		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//Post 방식 요청시 호출되는 메서드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException { 
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
