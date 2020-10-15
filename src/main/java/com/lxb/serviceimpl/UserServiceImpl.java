package com.lxb.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxb.entity.User;
import com.lxb.mapper.UserMapper;
import com.lxb.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public User getUserById(Integer id) {
		return userMapper.selectUserById(id);
	}

	@Override
	public void insertUser(String name, String sex) {
		userMapper.insert(name, sex);
	}
}
