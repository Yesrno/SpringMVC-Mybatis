package service;


import javax.swing.JOptionPane;

import org.springframework.stereotype.Service;

import pojo.Login;
import pojo.User;

@Service
public class UserServiceImpl implements UserService {

	
	@Override
	public boolean valid(Login login,User u) {
		// TODO Auto-generated method stub
		System.out.print(login.getUserName());
		System.out.print(login.getPassWord());
		if(u!=null) {
			if((u.getPass()).equals(login.getPassWord())) {
				
				JOptionPane.showMessageDialog(null,"登陆成功","登录",JOptionPane.PLAIN_MESSAGE);
				return false;
			}
			else {
				JOptionPane.showMessageDialog(null,"密码错误","登录",JOptionPane.PLAIN_MESSAGE);
				return true;
			}
		}
		else {
			JOptionPane.showMessageDialog(null,"用户名不存在","登录",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
	}

}
