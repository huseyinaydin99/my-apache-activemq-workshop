package tr.com.huseyinaydin.dao.service;

import tr.com.huseyinaydin.pojo.User;

public interface UserDAO {
	public User getUserByUsername(String username);
}
