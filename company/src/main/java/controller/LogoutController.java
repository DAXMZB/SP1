package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LogoutController
 */
@WebServlet("/LogoutController")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LogoutController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 获取当前用户的会话
		HttpSession session=request.getSession(false); // 如果会话不存在则不创建新会话
		
		if(session !=null)
		{
			// 使会话无效，注销用户
			session.invalidate();
		}
		 // 重定向到登入页面或其他合适的页面
        response.sendRedirect("index.jsp"); // 替换为您的登入页面的URL
        /**
         * HttpSession session=request.getSession();
		session.removeAttribute("M");
		
		response.sendRedirect("index.jsp");
         */
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	

}
