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
import java.sql.ResultSet;


public class WebServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		Connection conn = null;
        	Statement stmt = null;
        	ResultSet rs = null;
		try 
		{            
           		Class.forName("com.mysql.jdbc.Driver").newInstance();
        	}
	       	catch (Exception ex)
	       	{
                }

       		try
	       	{
           	 	conn =	DriverManager.getConnection("jdbc:mysql://localhost/test?"
                                            			+ "user=root"
                                           			+ "&password=");

            		resp.setContentType("text/html; charset=UTF-8");
            		stmt = conn.createStatement();
            		String sql2 = "SELECT * from xs";
            		rs = stmt.executeQuery(sql2);
            		resp.getWriter().println("<html><head><title>Member List</title></head><body><h1>Member List</h1><table bo							rder=\"1\"><tr><td>Name</td></tr>\n");
            		while(rs.next()) 
			{
                		
                		String firstName = rs.getString("name");               	
                		resp.getWriter().println("<tr><td>" +firstName + " "  + "</td></tr>\n");
            		}
            			resp.getWriter().println("</table>");
            			resp.getWriter().println("<p><a href=\".\"><button>返回</button></a></p>");
            			resp.getWriter().println("</body></html>");
       		} 
			catch (SQLException ex)
		       	{            
            			System.out.println("SQLException: " + ex.getMessage());
            			System.out.println("SQLState: " + ex.getSQLState());
            			System.out.println("VendorError: " + ex.getErrorCode());
            			resp.getWriter().println("Error!");
       			} 
			finally 
			{
            			if (rs != null) 
				{
                			try 
					{
                    				rs.close();
                			} 
					catch (SQLException sqlEx) 
					{
                			}
                				rs = null;
            			}

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

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException
	{
		resp.setContentType("text/html; charset=UTF-8");
		Connection conn = null;
		Statement stmt = null;		
		String name = req.getParameter("name");
		String DeleteName = req.getParameter("delete");
		String Search = req.getParameter("search");
		resp.getWriter().println("<html><head><title>information</title></head><body><h1>information</h1>							\n");		
       		try
       		{
             		Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection("jdbc:mysql://localhost/test?"
							 + "user=root" + "&password=");
			if(!conn.isClosed())
			{
			//	resp.getWriter().println("Connect data base success");
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
			if(name.equals(null) == false)
			{
				String sql = "INSERT INTO xs(name) " + "VALUES('" + name + "');";
				stmt.executeUpdate(sql);
				resp.getWriter().println( "add  " + name + "  success");
			}
			
			if(DeleteName.equals(null) == false)
			{
				String deletSql = "delete from xs "+" where name= '"+DeleteName+"'; ";
				stmt.executeUpdate(deletSql);
				resp.getWriter().println( "Delete  " + DeleteName + "  success");
			}
			if(Search.equals(null) == false)
			{
				String sql = "select * from xs";     
              			ResultSet rs = stmt.executeQuery(sql);    
            		
            			while (rs.next())
		       		{
                       			String name3 = rs.getString("name"); 
		       			if(name3.equals(Search))
					{	
      						resp.getWriter().println("ture");
						break;
					}
					else
					{
						resp.getWriter().println("false");
						break;
					}		
           			}  
			}
			resp.getWriter().println("<p><a href=\"\"><button>继续操作</button></a></p>");
			resp.getWriter().println("<p><a href=\"\"><button>member list</button></a></p>");
            		resp.getWriter().println("</body></html>");	
            		
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
