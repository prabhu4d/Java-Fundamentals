package com.prabhu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * We can map url to servlet using XML file, but it time-consuming
 * 
 * we can use Annotations for URL mapping
 * 
 * */

@WebServlet(value = "/add")
public class AddServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int result = num1 + num2;
		
		System.out.println("Add Result " + result);
		
		
		// Send Redirect with help of URL Rewriting
//		res.sendRedirect("sq-redirect?result=" + result);
		
		
		// Send Redirect with help of Session Management
//		HttpSession session = req.getSession();
//		session.setAttribute("result", result);
//		res.sendRedirect("sq-redirect");
		
		
		// Send Redirect with help of Cookies
		Cookie cookie = new Cookie("result", result+"");
		res.addCookie(cookie);
		res.sendRedirect("sq-redirect");
		
//		// Redirecting to another server without informing to client
//		req.setAttribute("result", result);
//		
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
	}
}
