package jp.co.aforce.beans;

public class UsersBean {
	private String member_Id;
	private String password;
	private String lastName;
	private String firstName;
	private String address;
	private String mailAddress;
	
	public UsersBean(){}
	
	public UsersBean(String memberId, String password, String lastName, String firstName, String address, String mailAddress) {
		this.member_Id = memberId;
		this.password = password;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.mailAddress = mailAddress;
	}
	
	public String getID() {
		return member_Id;
	}
	
	public void setId(String memberId) {
		this.member_Id = memberId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String getMemberId() {
		return member_Id;
	}

	public void setMemberId(String member_Id) {
		this.member_Id = member_Id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

}
