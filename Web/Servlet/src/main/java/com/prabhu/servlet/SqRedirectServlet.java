package com.prabhu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sq-redirect")
public class SqRedirectServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();
		
		// for URL rewriting
//		int result = Integer.parseInt(req.getParameter("result"));
		
		// for session management
//		HttpSession session = req.getSession();
//		int result = (int) session.getAttribute("result");
		
		// for cookies
		int result = 0;
		Cookie cookies[] = req.getCookies();
		for(Cookie c: cookies) {
			if(c.getName().equals("result")) {
				result = Integer.parseInt(c.getValue());
			}
		}
		
		
		result *= result;
		
		out.print("Sq Redirect is -> " + result);
	}
}
