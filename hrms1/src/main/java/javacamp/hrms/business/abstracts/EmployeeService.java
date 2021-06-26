package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Employees;


public interface EmployeeService {
	Result add(Employees employee);
	Result update(Employees employee);
	Result delete(int id);
	DataResult<Employees> getById(int id);
	
	DataResult<List<Employees>> getAll();
}
