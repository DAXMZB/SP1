package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.impl.memberDaoImpl;
import model.member;

/**
 * Servlet implementation class LoginController
 */
//@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Name = request.getParameter("name");
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		member m = null;
		
		boolean isValidUser = new memberDaoImpl().queryUser(Username, Password);
		if (isValidUser == true) {
			HttpSession session = request.getSession();
			m=new memberDaoImpl().PrintUser(Username);
			Name=m.getName();
			session.setAttribute("name", Name);
			response.sendRedirect("welcome.jsp");
		} else {
			// 登录失败，重定向回登录页面或显示错误信息
			response.sendRedirect("index.jsp?error=true");
		}
	}

}
