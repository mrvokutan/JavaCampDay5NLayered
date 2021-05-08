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
 			System.out.println(" Kayýt baþarýlý! ");
 			userdao.add(user);
 		}
		else {
 			System.out.println(" Kayýt baþarýsýz! ");
	}
}
	
	@Override
	public void signIn(User user) {
		System.out.println(" Giriþ için bilgilerinizi giriniz. ");
	}



	

}
