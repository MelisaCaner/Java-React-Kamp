package javacamp.hrms.core.verifications;

public interface VerificationService {
	void sendLink(String email);
	String sendCode();

}
