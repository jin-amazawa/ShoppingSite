package jp.co.aforce.model;

import jp.co.aforce.beans.UsersBean;
import jp.co.aforce.dao.LoginDao;

public class LoginLogic {
	public UsersBean login(String member_Id, String password) {
		LoginDao loginDao = new LoginDao();
		UsersBean user = loginDao.selectByIdAndPassword(member_Id, password);
		
		return user;
	}
}
