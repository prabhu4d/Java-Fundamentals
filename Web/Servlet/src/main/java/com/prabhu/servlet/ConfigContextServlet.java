package com.prabhu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConfigContextServlet extends HttpServlet{
	
	/*
	 * 
	 * ServletContext params shared by all servlets
	 * ServletConfig is specific to specific servlet
	 * 
	 * 
	 * */
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("Hi ");
		
		ServletContext ctx = getServletContext();
		String Name = ctx.getInitParameter("Name");
		out.println(Name);
		
		ServletConfig cg = getServletConfig();
		String name2 = cg.getInitParameter("Name");
		out.println(name2);
	}
}
