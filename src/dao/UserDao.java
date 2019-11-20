package dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import pojo.User;

import org.apache.ibatis.annotations.Mapper;


@Repository("userDao")
@Mapper
public interface UserDao {

	public User selectUserByid(String name); 
	public List<User> selectAllUser(); 
	public Integer addUser(User user);
}
