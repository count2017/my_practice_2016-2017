package model;

public class User {
	private String uname;
	private String upass;
	private String role;
	@Override
	public String toString() {
		return "User [uname=" + uname + ", upass=" + upass + ", role=" + role + "]";
	}
	public User() {
		super();
	}
	public User(String uname, String upass, String role) {
		super();
		this.uname = uname;
		this.upass = upass;
		this.role = role;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpass() {
		return upass;
	}
	public void setUpass(String upass) {
		this.upass = upass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
