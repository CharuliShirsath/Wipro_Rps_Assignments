package com.wipro0.service;

import java.util.List;

import com.wipro0.model.User;

public interface UserService {
	public User getUserByName(String username);
	public List<User> getAllUsers();
	public User addUser(User user);
	public String deleteUser(String username);
	public User updateUserPassword(User user);
}

