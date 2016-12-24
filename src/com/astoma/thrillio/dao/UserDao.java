package com.astoma.thrillio.dao;

import com.astoma.thrillio.DataStore;
import com.astoma.thrillio.entities.Bookmark;
import com.astoma.thrillio.entities.User;

public class UserDao {
	public User[] getUsers() {
		return DataStore.getUsers();
	}

}
