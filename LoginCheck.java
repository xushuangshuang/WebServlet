package com.bodejidi;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class LoginCheck extends HttpServlet {

    public void doGet(HttpServletRequest req,HttpServletResponse res)
    {
        //定义所需要的对象(进入数据库验证用户信息需要用到)
        Connection ct=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try{

            //业务逻辑 去数据库验证用户名和密码
            //接收前面传过来的用户名和密码
            String userName=req.getParameter("username");
            String userPassword=req.getParameter("password");

            //连接数据库进行验证
            //1.加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.建立连接
            ct=DriverManager.getConnection("jdbc:mysql://localhost/test?","root","");
            //3.创建 PreparedStatement
            ps=ct.prepareStatement("SELECT membar(first_name, last_name, date_created, last_updated)"+userName+"' AND USERPASSWORD='"+userPassword+"'");
            rs=ps.executeQuery();

            //验证
            if(rs.next())
            {
                res.sendRedirect("welcome?username="+first_name+"&password="+last_name);
                return;
                }
                else
                {
                    res.sendRedirect("login");
                    }
        }
        catch(Exception e)
        {
            e.printStackTrace();
            }
            //关闭资源
            finally
            {
                try{
                    if(rs!=null)
                    {
                        rs.close();
                        }
                        if(ps!=null)
                        {
                            ps.close();
                            }
                            if(ct!=null)
                            {
                                ct.close();
                                }
                    }
                catch(Exception e)
                {
                    e.printStackTrace();
                    }
                }

        }

    public void doPost(HttpServletRequest req,HttpServletResponse res)
    {
        this.doGet(req,res);
        }
}

