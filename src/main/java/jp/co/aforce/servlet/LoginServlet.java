package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.UsersBean;
import jp.co.aforce.model.LoginLogic;

@WebServlet("/login") 
public class LoginServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String member_Id = request.getParameter("id"); 
		String password = request.getParameter("password");
		
		LoginLogic loginLogic = new LoginLogic();
		UsersBean user = loginLogic.login(member_Id, password);	
		
        if(user != null) {
            HttpSession session = request.getSession();
            
            session.setAttribute("user", user);
            session.setMaxInactiveInterval(1800);
            
            response.sendRedirect(request.getContextPath() + "/views/secure/user-menu.jsp");
        } else {
            request.getRequestDispatcher("/views/login-error.jsp").forward(request, response);
        }
	}
}
