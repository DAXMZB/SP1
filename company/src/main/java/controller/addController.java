package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.memberDaoImpl;
import model.member;

/**
 * Servlet implementation class addController
 */
//@WebServlet("/addController")
public class addController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public addController() {
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
		/*
		 * 1.設定 2.getwrite 3.request-->接收 4.new member 5.add 6.成功 7.連結
		 */
//		request.setCharacterEncoding("utf-8");
//		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String memberNo = request.getParameter("memberNo");
		String Name = request.getParameter("name");
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		String Address = request.getParameter("address");
		String Phone = request.getParameter("phone");
		String Mobile = request.getParameter("mobile");

		member m = new member(memberNo, Name, Username, Password, Address, Phone, Mobile);

		new memberDaoImpl().add(m);

		out.write("建檔成功<br><a href=index.jsp>回首頁</a>");

	}

}
