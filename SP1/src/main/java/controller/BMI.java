package controller;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BMI
 */
//@WebServlet("/BMI")
public class BMI extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BMI() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * 1.設定-->encodind-->utf-8 ,html 2.getwrite 3.接收-->name , ruler+pen-->int
		 * 4.sum-->>=1000-->95折
		 */

		String a = request.getParameter("height");
		String b = request.getParameter("weight");
		// String c= request.getParameter("");
		if (a != null && b != null) {
			double Height = Double.parseDouble(request.getParameter("height"));
			double Weight = Double.parseDouble(request.getParameter("weight"));
			double H = Height / 100;
			double B= Weight / (H * H);
			String bmi=Double.toString(B);
			
			BigDecimal bd = new BigDecimal(bmi);
			BigDecimal roundOff = bd.setScale(2, RoundingMode.FLOOR);

			// request.setAttribute("bmi", roundOff);
			// request.getRequestDispatcher("porder/loginSuccess.jsp").forward(request,
			// response);;
			HttpSession session = request.getSession();
			session.setAttribute("BMI", bmi);
			response.sendRedirect("porder/loginSuccess.jsp");

		}
	}

}
