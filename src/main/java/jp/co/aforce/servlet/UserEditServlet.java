package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.UsersBean;
import jp.co.aforce.model.EditLogic;

@WebServlet("/userEdit")
public class UserEditServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		HttpSession session = request.getSession();
		UsersBean user = (UsersBean)session.getAttribute("user");
		
		String id = user.getMemberId();
		String password = user.getPassword();
		String lastName = user.getLastName();
		String firstName = user.getFirstName();
		String email = user.getMailAddress();
		
		EditLogic editLogic = new EditLogic();
		boolean editSuccess = editLogic.edit(lastName, firstName, email, id, password);
		
		if(editSuccess) {
			request.getRequestDispatcher("/views/userEditSuccess.jsp").forward(request, response);
		}else {
			String errMessage = "修正エラー";
			request.setAttribute("errMessage", errMessage);
			request.getRequestDispatcher("/views/userEditError.jsp").forward(request, response);
		}
		
	}
}
