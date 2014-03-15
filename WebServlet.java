package com.bodejidi;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class WebServlet extends HttpServlet
{
	public void doget(HttpServletRequest req, HttpServletResponse resp)
	{
	
	}

	public void dopust(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		resp.setContentType("text/html; charset=UTF-8");
		
	
	/*
	 * int age = 0;
		String name = req.getParameter("name");
		String age = req.getParameter(age);
		*/
		
       		try
       		{
             		  Class.forName("com.mysql.jdbc.Driver").newInstance();
       		 } 
		catch (Exception ex)
       		{
            
       		 }
				
		Connection conn = null;
				
		try
		{
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test?"
							+ "username = root" + "password =");

			resp.getWriter().println("success");	
		}
		catch(SQLException ex)
		{
			System.out.println("SQLException: " + ex.getMessage());
           	 	System.out.println("SQLState: " + ex.getSQLState());
            		System.out.println("VendorError: " + ex.getErrorCode());
           		resp.getWriter().println("Error!");
		}	
	}

}
