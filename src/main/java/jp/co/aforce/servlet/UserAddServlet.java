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
import jp.co.aforce.model.AddLogic;

@WebServlet("/addUser")
public class UserAddServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		/**
		 * 現在のセッションを取得。なければ生成。
		 */
		HttpSession session = request.getSession();
		/**
		 * "user"セッションの情報を取得、及びUsersBean型にキャスト。
		 */
		UsersBean user = (UsersBean) session.getAttribute("user");
		
		/**
		 * AddLogicインスタンスのメソットの引数で使うためにそれぞれのデータの取得し、変数に代入。
		 */
		String id = user.getMemberId();
		String password = user.getPassword();
		String lastName = user.getLastName();
		String firstName = user.getFirstName();
		String address = user.getAddress();
		String email = user.getMailAddress();
		
		UsersDao usersDao = new UsersDao();
		boolean isUser = usersDao.userCheck(id, password);
		
		if(isUser) {
			String errMessage = "入力したユーザーIDとパスワードは、すでに登録済みです。";
			request.setAttribute("errMessage", errMessage);	
			request.getRequestDispatcher("/views/userAddError.jsp").forward(request, response);
		}
		
		AddLogic addLogic = new AddLogic();
		boolean addUser = addLogic.add(id, password, lastName, firstName, address, email);
		
		if(addUser) {
			response.sendRedirect(request.getContextPath() + "/views/userSuccess.jsp");
			session.removeAttribute("user");
		}else {
			String errMessage = "登録エラー";
			request.setAttribute("errMessage", errMessage);	
			request.getRequestDispatcher("/views/userAddError.jsp").forward(request, response);
		}
		
	}
}
