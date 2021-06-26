package business.abstarcts;

public interface VerificationService {
	boolean userNameControl(String username);
	boolean userSurnameControl(String usersurname);
	boolean userEmailControl(String email);
	boolean userPasswordControl(String password);

}
