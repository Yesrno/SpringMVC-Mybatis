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
				
				JOptionPane.showMessageDialog(null,"��½�ɹ�","��¼",JOptionPane.PLAIN_MESSAGE);
				return false;
			}
			else {
				JOptionPane.showMessageDialog(null,"�������","��¼",JOptionPane.PLAIN_MESSAGE);
				return true;
			}
		}
		else {
			JOptionPane.showMessageDialog(null,"�û���������","��¼",JOptionPane.PLAIN_MESSAGE);
			return true;
		}
	}

}
