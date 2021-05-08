package core;

import WithGoogle.GoogleManager;
import entities.concretes.User;

public class GoogleManagerAdapter implements Google {
	public void register(User user) {
		GoogleManager google = new GoogleManager();
		google.register(user.getName());
		
		
	}

}
