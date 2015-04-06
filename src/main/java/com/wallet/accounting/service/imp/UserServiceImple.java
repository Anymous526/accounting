package com.wallet.accounting.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wallet.accounting.dao.UserDao;
import com.wallet.accounting.entity.User;
import com.wallet.accounting.service.UserService;

@Service
@Transactional
public class UserServiceImple implements UserService {

	@Autowired
	private UserDao userMapper;

	@Override
	public List<User> findAllUser() {
		return userMapper.findAllUser();
	}

	@Override
	public User findById(int id) {
		return userMapper.findById(id);
	}

	@Override
	public boolean update(User user) {
		return userMapper.update(user);
	}

	@Override
	public boolean save(User user) {
		return userMapper.save(user);
	}

	@Override
	public boolean save(List<User> users) {
		return userMapper.saveAll(users);
	}

	@Override
	public User delete(User user) {
		userMapper.delete(user);
		return user;
	}

	@Override
	public boolean deleteById(int id) {
		return userMapper.deleteById(id);
	}

	@Override
	public boolean delete(List<User> users) {
		return userMapper.deleteAll(users);
	}

}
