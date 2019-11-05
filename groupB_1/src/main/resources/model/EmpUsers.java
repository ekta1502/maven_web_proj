package model;

public class EmpUsers {
	private String uid;
	private String uname;
	private String upwd;
	private String contact;
	private String email;
	private String gender;
	public EmpUsers() {
		super();
	}
	public EmpUsers(String uid, String uname, String upwd, String contact, String email, String gender) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.upwd = upwd;
		this.contact = contact;
		this.email = email;
		this.gender = gender;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
