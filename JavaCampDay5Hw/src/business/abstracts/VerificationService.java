package business.abstracts;

import entities.concretes.User;

public interface VerificationService {
	
	boolean passwordaut(User user);
	
	boolean mailaut(User user);
	
	boolean nameAndSurname(User user);
	

}
