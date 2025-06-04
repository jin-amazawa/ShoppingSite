package jp.co.aforce.servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import jp.co.aforce.beans.UsersBean;

@WebServlet("/userEditConfirm")
public class UserEditConfirmServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String lastName = request.getParameter("lastName");
		String firstName = request.getParameter("firstName");
		String email = request.getParameter("email");
		
		HttpSession session = request.getSession();
		
		UsersBean user = (UsersBean)session.getAttribute("user");
		
		/**
		 * ここで修正したデータを古いものと置き換えている。
		 * （そのため新しいセッション属性を作る必要はない。
		 * 	むしろ作るとややこしいうえに、戻る⇔確認を行ったり来たりするとエラーになる。
		 * 解決方法はあるかもしれないが、わからなかった。属性を1つにしたほうが簡単。）
		 */
		user.setLastName(lastName);
		user.setFirstName(firstName);
		user.setMailAddress(email);
		
		session.setAttribute("user", user);
		
		request.getRequestDispatcher("/views/secure/UserEditConfirm.jsp").forward(request, response);
		
	}
}
