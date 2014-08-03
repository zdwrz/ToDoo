package com.dz.utilities.todoo.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dz.utilities.todoo.domains.User;

@Component
public class UserDAOImpl implements UserDAO{
	@Autowired
	private SessionFactory sessionFactory;
	
	public Integer save(User user) {
		Integer seqId = (Integer)sessionFactory.getCurrentSession().save(user);
		return seqId;
	}

}
