package com.service;

import com.aspect.Log;
import com.dao.UserDAO;
import com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAO userDAO;
	@Log(name = "save")
	public void save(User user) {
		user.setId(UUID.randomUUID().toString());
		System.out.println(user.getId());
		userDAO.save(user);
		
	}
	@Log(name = "queryOne")
	@Transactional(propagation=Propagation.SUPPORTS)
	public User queryOne(String username ,String password) {
		System.out.println("《《《《《这是service的实现类》》》》");
		User user = userDAO.queryOne(username,password);
		return user;
	}


}
