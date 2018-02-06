package ua.myProject.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User extends BaseEntity{
	
	@Column
	private String login;
	
	@Column
	private String password;
	
	@Column
	private String nikname;
	
	@Column(name = "user_type")
	private int userType;            // 1 - admin, 0 - client

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNikname() {
		return nikname;
	}

	public void setNikname(String nikname) {
		this.nikname = nikname;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

}
