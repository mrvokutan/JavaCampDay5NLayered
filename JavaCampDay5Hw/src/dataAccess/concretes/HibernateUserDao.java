package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	List<User> users;
	
	

	

	@Override
	public void add(User user) {
		System.out.println(user.getName() + "  Adlý kullanýcý eklendi.");

		
	}

	@Override
	public void delete(User user) {
		System.out.println(user.getName() + "  Adlý kullanýcý silindi.");
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getName() + "  Adlý kullanýcý güncellendi.");
		
	}

	
	@Override
	public User get(String Email) {
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}



}
