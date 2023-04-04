package com.hosp.Servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hosp.dao.RegisterDAO;
import com.hosp.model.Register;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int pid=Integer.parseInt(request.getParameter("id"));
 		String pname=request.getParameter("name");
 		String pmembership=request.getParameter("membership");
 		String pdisease=request.getParameter("disease");
 		int pbill=Integer.parseInt(request.getParameter("bill"));
 		String pDoctor=request.getParameter("doctor");
		
 		Register user=new Register(pid,pname,pmembership,pdisease,pbill,pDoctor);
 		
 		HttpSession session=request.getSession(true);  
        session.setAttribute("pid",pid);  
        session.setAttribute("pname",pname);
        session.setAttribute("pmembership",pmembership);
        session.setAttribute("pdisease",pdisease);
        session.setAttribute("pbill",pbill);
        session.setAttribute("pDoctor",pDoctor);
        
 		int res=0;
		try {
			res = RegisterDAO.UpdateUser(user);
			System.out.print(res);
		} 
		catch (SQLException e) {
	     	e.printStackTrace();
		}
		session.setAttribute("res", res);
 			 RequestDispatcher rd=request.getRequestDispatcher("sucess.jsp");  
 	        rd.forward(request, response); 
 		
 	
 		  
	 
	}

	
}
