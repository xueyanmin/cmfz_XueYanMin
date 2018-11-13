package com.service;
import com.entity.User;

public interface UserService {
	public void save(User user);
	public User queryOne(String username ,String password);
}
