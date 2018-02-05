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

}
