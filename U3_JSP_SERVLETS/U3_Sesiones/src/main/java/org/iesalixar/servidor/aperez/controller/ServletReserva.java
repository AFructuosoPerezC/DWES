package org.iesalixar.servidor.aperez.controller;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.iesalixar.servidor.aperez.utils.Validation;

/**
 * Servlet implementation class ServletReserva
 */
@WebServlet("/ServletReserva")
public class ServletReserva extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletReserva() {
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
		HttpSession session = request.getSession(false);
		
		if (session != null) {
			String initDate = request.getParameter("initDate");
			String endDate = request.getParameter("endDate");
			String numPeople = request.getParameter("numPeople");
			String[] services = request.getParameterValues("services");
			
			if (Validation.validateDate(initDate) && Validation.validateDate(endDate)
					&& numPeople.matches("^[0-9]+$")) {
				session.setAttribute("initDate", initDate);
				session.setAttribute("endDate", endDate);
				session.setAttribute("numPeople", numPeople);
				session.setAttribute("services", Arrays.toString(services));
				
				response.sendRedirect("confirmar.jsp");
			}
		} else {
			response.sendRedirect("index.jsp");
		}
	}
}