package core.concretes;

import core.abstracts.SignUpService;
import entities.concretes.User;

public class MainAdapter implements SignUpService {

	@Override
	public void signUp(User user) {
	System.out.println("basarili bir sekilde giris yapildi." + user.getFirstName() + user.getLastName());
		
	}
	
	

}
