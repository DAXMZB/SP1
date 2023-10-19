package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.impl.porderDaoImpl;
import vo.porder;

/**
 * Servlet implementation class addPorderController
 */
@WebServlet("/addPorderController")
public class addPorderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addPorderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		porder p=(porder)session.getAttribute("P");
		
		new porderDaoImpl().add(p);
		
		response.sendRedirect("porder/finish.jsp");;
		
	}

}
