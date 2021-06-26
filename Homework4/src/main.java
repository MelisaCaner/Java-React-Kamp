import DataAccess.concretes.HiberniteUserDao;
import business.abstarcts.UserService;
import business.abstarcts.VerificationService;
import business.concretes.UserManager;
import business.concretes.VerificationUserManager;
import core.concretes.MainAdapter;
import entities.concretes.User;

public class main {

	public static void main(String[] args) {
		User Melisa= new User(1,"Melisa","Caner","melisa@outlok.com", "111111");
		UserService userService = new UserManager(new VerificationUserManager(), new HiberniteUserDao(), new MainAdapter());
		userService.signUp(Melisa);
		System.out.println("Hosgeldiniz");
		userService.signIn(Melisa.getEmail(), Melisa.getPassword());
		
		System.out.println("basarili bir sekilde kayit olunde ve giris yapildi");
	
	}
}
