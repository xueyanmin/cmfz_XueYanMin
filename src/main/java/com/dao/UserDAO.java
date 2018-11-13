package com.dao;


import com.entity.User;
import org.apache.ibatis.annotations.Param;



public interface UserDAO {
	public User queryOne(@Param("username") String username,
						 @Param("password") String password);
	public void save(User user);
}
