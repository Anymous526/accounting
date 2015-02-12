package com.wallet.accounting.service;

import java.util.List;

import com.wallet.accounting.entity.User;

public interface UserService {

	public List<User> findAllUser();

	public User findById(int id);

	public boolean update(User user);

	public boolean save(User user);

	public boolean save(List<User> user);

	public User delete(User user);

	public boolean deleteById(int id);

	public boolean delete(List<User> users);
}
