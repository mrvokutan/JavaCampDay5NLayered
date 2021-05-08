package business.concretes;

import business.abstracts.UserService;
import business.abstracts.VerificationService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {
	

	private VerificationService verificationService1;
	private UserDao userdao;
	
	
	
	public UserManager(VerificationService verificationService1, UserDao userdao) {
		super();
		this.verificationService1 = verificationService1;
		this.userdao = userdao;
	}


	@Override
	public void signUp(User user) {

		if(verificationService1.passwordaut(user) && verificationService1.mailaut(user) && verificationService1.nameAndSurname(user)) {
 			System.out.println(" Kay�t ba�ar�l�! ");
 			userdao.add(user);
 		}
		else {
 			System.out.println(" Kay�t ba�ar�s�z! ");
	}
}
	
	@Override
	public void signIn(User user) {
		System.out.println(" Giri� i�in bilgilerinizi giriniz. ");
	}



	

}
