package pojo;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class Register {

	@NotBlank(message="{User.userName.required}")
	@Length(min=1 , max=10, message="{userName.invalid}")
	private String userName; 
	
	@NotBlank(message="{User.passWord.required}")
	@Length(min=6,max=10,message="{passWord.invalid}")
	private String passWord;
	
	private String[] hobby;
	private String[] friends;
	private String carrer;
	private String houseRegister;
	@Length(min=0 , max=20, message="{remark.invalid}")
	private String remark;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String username) {
		userName=username;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String usernam) {
		passWord=usernam;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] usern) {
		hobby=usern;
	}
	public String[] getFriends() {
		return friends;
	}
	public void setFriends(String[] usernames) {
		friends=usernames;
	}
	public String getCarrer() {
		return carrer;
	}
	public void setCarrer(String use) {
		carrer=use;
	}
	public String getHouseRegister() {
		return houseRegister;
	}
	public void setHouseRegister(String user) {
		houseRegister=user;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remarks) {
		remark=remarks;
	}
	
}
