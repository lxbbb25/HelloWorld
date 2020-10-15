package com.lxb.service;

import com.lxb.entity.User;

public interface UserService {
	public User getUserById(Integer id);
	public void insertUser(String name, String sex);
}
