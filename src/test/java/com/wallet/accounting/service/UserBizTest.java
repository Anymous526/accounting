package com.wallet.accounting.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.wallet.accounting.entity.User;
import com.wallet.core.DataSourceType;
import com.wallet.core.DatabaseContextHolder;
import com.wallet.core.test.BaseTestSuite;

public class UserBizTest extends BaseTestSuite {

	@Autowired
	private UserService userService;

	@Test
	public void saveTest() {
		DatabaseContextHolder.setCustomerType(DataSourceType.dataSource1);
		User user = new User();
		user.setId(1000);
		user.setName("Kevina");
		user.setSex("女");
		user.setBirthday(new Date());
		userService.save(user);
	}

	@Ignore
	@Test
	public void saveListTest() {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 10; i++) {
			User user = new User();
			user.setId(i);
			user.setName("Kevin" + i);
			user.setSex(i % 2 == 0 ? "男" : "女");
			user.setBirthday(new Date());
			users.add(user);
		}
		userService.save(users);
	}

	@Ignore
	@Test
	public void updateTest() {
		User user = userService.findById(100);
		user.setName("小芳");
		user.setBirthday(new Date());
		userService.update(user);

	}

	@Ignore
	@Test
	public void deleteUserTest() {
		User user = userService.findById(1);
		userService.delete(user);
	}

	@Ignore
	@Test
	public void deleteByIdTest() {
		userService.deleteById(2);
	}

	@Ignore
	@Test
	public void deleteAll() {
		List<User> users = new ArrayList<User>();
		for (int i = 2; i < 6; i++) {
			User user = new User();
			user.setId(i);
			users.add(user);
		}

		userService.delete(users);
	}

	@Ignore
	@Test
	public void findAllUserTest() {
		List<User> users = userService.findAllUser();
		for (User user : users) {
			System.out.println(user.toString());
		}
	}

	@Ignore
	@Test
	public void findByIdTest() {
		User user = userService.findById(100);
		System.out.println(user.toString());

	}
}
