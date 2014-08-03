package com.dz.utilities.todoo.services;

import java.util.Date;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dz.utilities.todoo.dao.UserDAO;
import com.dz.utilities.todoo.domains.User;

@Component
public class UserManagerImpl implements UserManager{

	@Autowired
	private UserDAO userDAO;
	@Transactional
	public User createUser(String firstName, String lastName, String userName,
			String password) {
		User user = new User(firstName,lastName,new Date(),userName,password);
		Integer seqId = userDAO.save(user);
		if(seqId != null){
			user.setSeqId(seqId);
			return user;
		}else{
			return null;
		}
	}

}
