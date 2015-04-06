package com.wallet.accounting.dao.mybatis;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wallet.accounting.dao.BaseDao;
import com.wallet.accounting.dao.UserDao;
import com.wallet.accounting.entity.User;

@Repository
public class MyBatisUserDao extends BaseDao implements UserDao {

	private static final long serialVersionUID = -8680295073080841532L;

	private static final String nameSpace = "com.wallet.accounting.dao.UserMapper";
	
	@Override
	public List<User> findAllUser() {
		return this.getSqlSession().selectList(nameSpace+"");
	}

	@Override
	public User findById(int id) {
		return this.getSqlSession().selectOne(nameSpace+"", id);
	}

	@Override
	public boolean update(User user) {
		try {
			this.getSqlSession().update(nameSpace+"", user);
		} catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean save(User user) {
		this.getSqlSession().insert(nameSpace + ".insert", user) ;
		return true;
	}

	@Override
	public boolean saveAll(List<User> users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User delete(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAll(List<User> users) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> findByCondition() {
		// TODO Auto-generated method stub
		return null;
	}

}
