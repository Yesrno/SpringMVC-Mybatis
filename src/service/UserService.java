package service;

import pojo.Login;
import pojo.User;

public interface UserService {

	boolean valid(Login login,User u); 
}
