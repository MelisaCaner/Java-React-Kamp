package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.UserService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.UsersDao;
import javacamp.hrms.entities.concretes.Users;

@Service
public class UserManager implements UserService{

	private UsersDao userDao;
	
	@Autowired
	public UserManager(UsersDao usersDao) {
		super();
		this.userDao = usersDao;
	}

	@Override
	public Result add(Users users) {
		this.userDao.save(users);
	    return new SuccessResult("User has been added.");
	}

	@Override
	public Result update(Users users) {
		this.userDao.save(users);
      return new SuccessResult("User has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.userDao.deleteById(id);
      return new SuccessResult("User has been deleted.");
	}

	@Override
	public DataResult<Users> getById(int id) {
		return new SuccessDataResult<Users>(this.userDao.getById(id));
	}

	@Override
	public DataResult<List<Users>> getAll() {
		return new SuccessDataResult<List<Users>>(this.userDao.findAll());
	}

	@Override
	public DataResult<Users> getUsersByEmail(String email) {

		return new SuccessDataResult<Users>(this.userDao.findUserByEmail(email));
	}




}
