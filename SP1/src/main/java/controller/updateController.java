package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.porderDaoImpl;
import vo.porder;

/**
 * Servlet implementation class updateController
 */
@WebServlet("/updateController")
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
		/*
		 * 1.request-->A,B,C,ID-->轉 Int
		 * 2.篩選-->queryId--->改 A,B C
		 * 3.執行 update
		 * 4.切換回 porder/update.jsp
		 */
		int id=Integer.parseInt(request.getParameter("ID"));
		int A=Integer.parseInt(request.getParameter("A"));
		int B=Integer.parseInt(request.getParameter("B"));
		int C=Integer.parseInt(request.getParameter("C"));
		
		porder p=new porderDaoImpl().queryId(id);
		p.setA(A);
		p.setB(B);
		p.setC(C);
		
		new porderDaoImpl().update(p);
		
		response.sendRedirect("porder/update.jsp");
		
	}

}
