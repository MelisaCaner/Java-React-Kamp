package business.concretes;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import business.abstarcts.VerificationService;


public class VerificationUserManager implements VerificationService{

	
	String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

	
	@Override
	public boolean userNameControl(String username) {

		if (username.length() > 2) {
			return true;
		}
		else {
			System.out.println("isminiz en az 2 karakterden olusmalidir.");
			return false;
		}
	}

	@Override
	public boolean userSurnameControl(String usersurname) {

		if (usersurname.length() > 2) {
			return true;
		}
		else {
			System.out.println("isminiz en az 2 karakterden olusmalidir.");
			return false;
		}
	}

	@Override
	public boolean userEmailControl(String email) {
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		if (!matcher.matches()) {
			System.out.println("Lutfen emailinizi duzgun bicimde giriniz: 'benginur@benginur.com'");
			return false;
		}
		else {
			return true;
		}
	
	
	}

	@Override
	public boolean userPasswordControl(String password) {
		if(password.length() >= 6) {
			return true;
		}
		else {
			System.out.println("Parola en az 6 karaterden olusmalidir ");
			return false;
		}
		
	}

}
