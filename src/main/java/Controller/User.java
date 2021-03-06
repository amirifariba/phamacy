package Controller;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue
	@Column(name = "UserId")
	int userId;
	@Column(name = "UserName")
	String username;
	@Column(name = "password")
	String password;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User(int userId, String username, String password) {
		this.userId = userId;
		this.username = username;
		this.password = password;
	}

	public User() {
	}

}
