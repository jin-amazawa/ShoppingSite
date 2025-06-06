package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.UsersBean;
import jp.co.aforce.dao.UsersDao;

@WebServlet("/userDelete")
public class UserDeleteServlet extends HttpServlet{ 
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		UsersBean user = (UsersBean)session.getAttribute("user");
		
		String id = user.getID();
		
		UsersDao usersDao = new UsersDao();
		boolean isDelete = usersDao.deleteUser(id);
		
		if(isDelete) {
			session.removeAttribute("user");
			request.getRequestDispatcher("/views/userDeleteSuccess.jsp").forward(request, response);
		}else {
			String errMessage = "削除エラー";
			request.setAttribute("errMessage", errMessage);	
			request.getRequestDispatcher("/views/userDeleteError.jsp").forward(request, response);
		}
		
	}
}
