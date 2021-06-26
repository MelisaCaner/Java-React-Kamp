package business.concretes;

import DataAccess.abstracts.UserDao;
import business.abstarcts.UserService;
import business.abstarcts.VerificationService;
import core.abstracts.SignUpService;
import entities.concretes.User;

public class UserManager implements UserService {
	
	private VerificationService verificationservice;
	private UserDao userDao;
	private SignUpService signUpService;
	
	public UserManager(VerificationService verificationService, UserDao userDao, SignUpService signUpService) {
		super();
		this.verificationservice = verificationService;
		this.userDao = userDao;
		this.signUpService = signUpService;

	}
	
	
	
	@Override
	public void signUp(User user) {
		if (verificationservice.userEmailControl(user.getEmail()) 
				&& verificationservice.userNameControl(user.getFirstName())
				&& verificationservice.userSurnameControl(user.getLastName())
				&& verificationservice.userPasswordControl(user.getPassword())
				){
				
				userDao.add(user);
				signUpService.signUp(user);
				
				System.out.println("Kayit basarili,Hosgeldiniz :");
				System.out.println("Email dogrulamasi icin lutfen emailinizi kontol ediniz. " + user.getEmail());

				
				
		
			}
		

		
		
	}
	@Override
	public void signIn(String email, String password) {
		for(int i = 0; i<userDao.getAll().size(); i++) {
			if (userDao.getAll().get(i).getEmail().equals(email) && userDao.getAll().get(i).getPassword().equals(password)) {
				System.out.println("Sisteme giris yaptiniz :*");
				return;
			}
			
			System.out.println("Sifre veya email yanlis,lutfen tekrar deneyin ");
			
		}
		
	}


		
	}


	





