package javacamp.hrms.business.abstracts;

import java.util.List;


import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Users;

public interface UserService {
	Result add(Users users);
    Result update (Users users);
    Result delete(int id);
    DataResult<Users> getById(int id);
    
    DataResult<Users> getUsersByEmail(String email);
	DataResult<List<Users>> getAll();

}
