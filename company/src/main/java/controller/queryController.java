package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.memberDaoImpl;
import model.member;

/**
 * Servlet implementation class queryController
 */
//@WebServlet("/queryController")
public class queryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public queryController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 1.設定-->response-->中文,html,getWrite 2.queryAll2()-->List 3.list轉
		 * array-->toArray 4.輸出列印-->table
		 */
//		request.setCharacterEncoding("utf-8");
//		response.setCharacterEncoding("utf-8");
//		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		List<member> l = new memberDaoImpl().queryA112();
		member[] m = l.toArray(new member[l.size()]);

		out.println(
				"<table width=400 align=center border=1 bgcolor=black><tr><td>id<td><font color=white>姓名<td><font color=white>帳號<td><font color=white>密碼");

		for (int i = 0; i < m.length; i++) {
			out.println("<tr><td><font color=white>" + m[i].getId() + "<td><font color=white>" + m[i].getName()
					+ "<td><font color=white>" + m[i].getUsername() + "<td><font color=white>" + m[i].getPassword());
		}

		out.println("<tr><td colspan=4 align=center><a href=index.jsp>回首頁</a>" + "</table>");
		
	}

}
