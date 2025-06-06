package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.UsersBean;

@WebServlet("/userDeleteConfirm")
public class userDeleteConfirm extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		UsersBean user = (UsersBean)session.getAttribute("user");
		
		String lastName = user.getLastName();
		
		request.setAttribute("lastName", lastName);
		
		request.getRequestDispatcher("/views/secure/userDeleteConfirm.jsp").forward(request, response);
	}
}
