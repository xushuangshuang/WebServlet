package com.bodejidi.login;
//引包
import javax.servlet.http.*;
import java.io.*;

public class Login extends HttpServlet {

    public void doGet(HttpServletRequest req,HttpServletResponse res)
    {
        //业务逻辑
        //登录界面
        try
        {
            res.setContentType("text/html;charset=UTF-8");
            PrintWriter pw=res.getWriter();

            pw.println("<html>");
            pw.println("<body>");
            pw.println("<h1>用户登录界面</h1>");
            pw.println("<form action=loginCheck name=form>");
            pw.println("用户名:<input type=text name=username><br>");
            pw.println("密码:<input type=password name=password><br>");
            pw.println("<input type=submit value=确认>");
            pw.println("</form>");
            pw.println("</body>");
            pw.println("</html>");
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

