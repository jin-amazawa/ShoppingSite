package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.UsersBean;

@WebServlet("/UserAddConfirm")
public class UserAddConfirmServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		UsersBean user = new UsersBean();
		user.setId(id);
		user.setPassword(password);
		user.setLastName(lastName);
		user.setFirstName(firstName);
		user.setAddress(address);
		user.setMailAddress(email);
		
		HttpSession session = request.getSession();
		
		session.setAttribute("user", user);
		
		request.getRequestDispatcher("/views/secure/UserAddConfirm.jsp").forward(request, response);
	}
}
