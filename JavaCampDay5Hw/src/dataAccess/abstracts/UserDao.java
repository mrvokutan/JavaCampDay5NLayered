package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
	
	
	void delete (User user);
	void add (User user);
	void update(User user);
	
	 User get(String Email);
	
	 List<User> getAll();
	
}
