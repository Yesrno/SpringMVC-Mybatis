package pojo;


public class User {

	private String user; 
	private String pass;
	private String hob;
	private String fri;
	private String car;
	private String house; 
	private String rem;
	
	public String toString() {
		return user+pass+hob+fri+car+house+rem;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String username) {
		user=username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String usernam) {
		pass=usernam;
	}
	public String getHob() {
		return hob;
	}
	public void setHob(String usern) {
		hob=usern;
	}
	public String getFri() {
		return fri;
	}
	public void setFri(String usernames) {
		fri=usernames;
	}
	public String getCar() {
		return car;
	}
	public void setCar(String use) {
		car=use;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String user) {
		house=user;
	}
	public String getRem() {
		return rem;
	}
	public void setRem(String remarks) {
		rem=remarks;
	}
}
