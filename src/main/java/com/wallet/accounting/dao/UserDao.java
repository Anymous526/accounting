package com.wallet.accounting.dao;

import java.util.List;

import com.wallet.accounting.entity.User;

public interface UserDao {

	public List<User> findAllUser();

	public User findById(int id);

	public boolean update(User user);

	public boolean save(User user);

	public boolean saveAll(List<User> users);

	public User delete(User user);

	public boolean deleteById(int id);

	public boolean deleteAll(List<User> users);

	public List<User> findByCondition();
}
