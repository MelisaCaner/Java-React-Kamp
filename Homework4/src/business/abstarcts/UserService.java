package business.abstarcts;

import entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(String email,String password);
	
	

}
