package com.bodejidi;
//引包
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Welcome extends HttpServlet {

    public void doGet(HttpServletRequest req,HttpServletResponse res)
    {
        try{
            PrintWriter pw=res.getWriter();
            pw.println("Welcome to my website!");
            return;
            }
        catch(Exception e)
        {
            e.printStackTrace();
            }
        }

    public void doPost(HttpServletRequest req,HttpServletResponse res)
    {
        this.doGet(req,res);
        }
}

