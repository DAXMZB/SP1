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
 * Servlet implementation class updateController
 */
//@WebServlet("/updateController")
public class updateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*
		 * 1.擷取-->id,name,password
		 * 2.id-->轉 int
		 * 3.queyId()-->member-->改內容 name,password
		 * 4.update-->修改
		 * 5.回首頁 , 查詢
		 */
		
		int ID=Integer.parseInt(request.getParameter("id"));
		String Name=request.getParameter("name");
		String Password=request.getParameter("password");
		
		member m=new memberDaoImpl().queryID(ID);
		m.setName(Name);
		m.setPassword(Password);
		
		new memberDaoImpl().update(m);
		
		PrintWriter out=response.getWriter();
		out.println("<a href=index.jsp>回首頁</a><br>"+
					"<a href=queryController>查詢</a>");
	}

}
