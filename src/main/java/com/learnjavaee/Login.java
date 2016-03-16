package com.firstweb;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.firstweb.JdbcConnection;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getParameter("username");
        request.getParameter("password");
        request.getSession().setAttribute("users", request.getParameter("username"));      //将users放在Attribute中
        JdbcConnection user1=new JdbcConnection();
        user1.setUserName(request.getParameter("username"));
        user1.setPassword(request.getParameter("password"));
        System.out.println(request.getParameter("username")+request.getParameter("password"));
        
        if(user1.validate())
        {
          
            request.getRequestDispatcher("welcome.jsp").forward(request, response); //校验用户名密码正确，跳转到welcome.jsp
             
        }
        else
        {
            request.getRequestDispatcher("index.jsp").forward(request, response);  //校验用户名密码不正确，跳转到index.jsp
            
        }
        
   }
	}


