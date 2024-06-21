package com.wipro0.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro0.dao.UserDao;
import com.wipro0.model.User;

@Service
public class UserServiceImpl implements UserService{
	//Tight-coupling
//	UserDAO userDao = new UserDaoImpl();
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public User getUserByName(String username) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userDao.getUserByName(username);

	}
	@Override
	public List<User> getAllUsers() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return userDao.getAllUsers();

	}
	@Override
	public User addUser(User user) {
		
		return userDao.addUser(user);
	}
	@Override
	public String deleteUser(String username) {
		
		return userDao.deleteUser(username);
	}
	@Override
	public User updateUserPassword(User user) {
		
		return userDao.updateUserPassword(user);
	}


}
