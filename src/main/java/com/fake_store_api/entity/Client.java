package com.fake_store_api.entity;

/**
 * This class is only for simulation to connect to the database.
 */

//@Entity
//@Table(name = "client")
public class Client {
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="id")
	private Long id;
	
	//@Column(name="firstname")
	private String firstname;
	
	//@Column(name="lastname")
	private String lastname;
	
	//@Column(name="email")
	private String email;
	
	//@Column(name="phone")
	private String phone;
	
	//@Column(name="username")
	private String username;
	
	//@Column(name="password")
	private String password;

	public Client() {
		super();
	}

	public Client(Long id, String firstname, String lastname, String email, String phone, String username,
			String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.username = username;
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	@Override
	public String toString() {
		return "Client [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", phone=" + phone + ", username=" + username + ", password=" + password + "]";
	}
	
	
}
