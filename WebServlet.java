package com.bodejidi;
import javax.servlet.ServletException;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Statement;

public class WebServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
	
	}

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		resp.setContentType("text/html; charset=UTF-8");
		Connection conn = null;
		Statement stmt = null;		
		String name = req.getParameter("name");
		
       		try
       		{
             		Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test?"
							 + "user=root" + "&password=");
			if(!conn.isClosed())
			{
				resp.getWriter().println("Connect data base success");
			}
			else
			{
				resp.getWriter().println("Connect data base fail");
			}
       		} 
		catch (Exception ex)
       		{
            
       		}
				
		
		try
		{
			
			stmt = conn.createStatement();
			String sql = "INSERT INTO xs(name) " + "VALUES(name);";
			System.out.println("SQL: " + sql);
			stmt.execute(sql);
			resp.getWriter().println( "add  " + name + "  success");
				
		}
		catch(SQLException ex)
		{
			System.out.println("SQLException: " + ex.getMessage());
           	 	System.out.println("SQLState: " + ex.getSQLState());
            		System.out.println("VendorError: " + ex.getErrorCode());
           		resp.getWriter().println("Error!");
		}
		finally 
		{
           
           		 if (stmt != null)
			 {
              			 try
				 {
                    			stmt.close();
               			 }
				 catch (SQLException sqlEx)
				 {
                  
              		 	 }
                			stmt = null;
          		  }

           		 if (conn != null)
			 {
                		try 
				{
                   			 conn.close();
              			} 
				catch (SQLException sqlEx)
			        {
                   
               			}
                			conn = null;
            		}
    
		}
	}

}
