package jp.co.aforce.model;

import jp.co.aforce.dao.UsersDao;

public class AddLogic {
	public boolean add(String id, String password, String lastName, String firstName, String address, String email) {

		UsersDao usersDao = new UsersDao();
		boolean addUser = usersDao.userAdd(id, password, lastName, firstName, address, email);
		
		return addUser;
	}
}
