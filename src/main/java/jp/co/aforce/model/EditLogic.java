package jp.co.aforce.model;

import jp.co.aforce.dao.UsersDao;

public class EditLogic {
	public boolean edit(String lastName, String firstName, String email, String id, String password) {
		
		UsersDao usersDao = new UsersDao();
		boolean editSuccess = usersDao.updateUser(lastName, firstName, email, id, password);
		
		return editSuccess;
	}
}
