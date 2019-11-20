package pojo;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

public class Login {
	
	@NotBlank(message="{User.userName.required}")
	@Length(min=1,max=10,message="{userName.invalid}")
	private String userName;
	@NotBlank(message="{User.passWord.required}")
	@Length(min=6,max=10,message="{passWord.invalid}")
	private String passWord;
	
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
}
