package com.wipro0.dao;

import java.util.List;

import com.wipro0.model.User;

public interface UserDao {
	public User getUserByName(String username);
	public List<User> getAllUsers();
	public User addUser(User user);
	public String deleteUser(String username);
	public User updateUserPassword(User user);

}
