package DataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import DataAccess.abstracts.UserDao;
import entities.concretes.User;


public class HiberniteUserDao implements UserDao{
	private List<User>users;

	public HiberniteUserDao() {
		super();
		this.users = new ArrayList<User>();
	}
	@Override
	public void add(User user) {
		System.out.println("Kullanýcý sisteme eklendi" + user.getFirstName()+ user.getLastName());
		
	}
	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return this.users;
	}

}
