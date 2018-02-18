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
	private boolean userType;            // 1 - admin, 0 - client

	public User() {
	}

	public User(String login, String password, String nikname, boolean userType) {
		this.login = login;
		this.password = password;
		this.nikname = nikname;
		this.userType = userType;
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

	public boolean getUserType() {
		return userType;
	}

	public void setUserType(boolean userType) {
		this.userType = userType;
	}

}
