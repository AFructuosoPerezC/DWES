package org.iesalixar.servidor.aperez.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.iesalixar.servidor.aperez.utils.Validation;

/**
 * Servlet implementation class ServletInicio
 */
@WebServlet("/ServletInicio")
public class ServletInicio extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletInicio() {
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
		String uname = request.getParameter("uname");
		String pass = request.getParameter("pass");
		String passCheck = request.getParameter("passCheck");
		String email = request.getParameter("email");

		HttpSession session = null;
		
		if ((Validation.validateUsername(uname) && Validation.validatePassword(pass)
				&& Validation.validatePassword(passCheck) && Validation.validateEmail(email))
				&& passCheck.equals(pass)) {
			session = request.getSession();
			
			session.setAttribute("uname", uname);
			session.setAttribute("sessionDate", session.getCreationTime());
			
			response.sendRedirect("reserva.jsp");
		} else {
			response.sendRedirect("index.jsp");
		}
	}
}