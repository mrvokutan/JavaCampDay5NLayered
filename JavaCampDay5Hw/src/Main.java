import business.concretes.UserManager;
import business.concretes.VerificationManager;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
		
		
		User user = new User("Merve" , "Okutan" , "merve61okutan@gmail.com" , "123456789");
		
		UserManager userManager = new UserManager(new VerificationManager(), new HibernateUserDao());
		userManager.signUp(user);

}}