
package com.zensar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.User;
import com.zensar.db.UserDAO;

@Service
public class LoginService {
	@Autowired
	UserDAO dao;

	public User ValidateUser(User user) {
		return this.dao.save(user);
	}

	public User User(User user) {
		return null;
	}
}
