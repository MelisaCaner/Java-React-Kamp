package core.concretes;

import Google.GoogleService;
import core.abstracts.SignUpService;
import entities.concretes.User;

public class GoogleManager implements SignUpService {

	@Override
	public void signUp(User user) {
		GoogleService googleService = new GoogleService();
		googleService.signUp(user.getEmail());
		
	}

}
