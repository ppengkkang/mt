package com.brightd.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.brightd.dao.IUserDao;
import com.brightd.model.User;
import com.brightd.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {
	@Resource
	private IUserDao userDao;
	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(userId);
	}

}
