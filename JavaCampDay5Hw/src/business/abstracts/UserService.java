package business.abstracts;


import entities.concretes.User;

public interface UserService {
	
	void signIn(User user);
	
	void signUp(User user);
	
	
}
