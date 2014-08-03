package com.dz.utilities.todoo.services;

import com.dz.utilities.todoo.domains.User;

public interface UserManager {
	User createUser(String firstName, String lastName, String userName, String password);
}
