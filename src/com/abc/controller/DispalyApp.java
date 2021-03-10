package com.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/disp")
public class DispalyApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("img/jpg");// since the method is overriden, JVM gives preference for child class method

		PrintWriter out = response.getWriter();

		out.println("<html><body>");
		out.println("<h1 style='color:red; text-align:center'>Servlets are amazing to execute!!!</h1>");
		out.println("</body></html>");

		out.close();

	}

}
