package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.EmployeeService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.dataAccess.abstracs.EmployeesDao;
import javacamp.hrms.entities.concretes.Employees;


@Service
public class EmployeesManager implements EmployeeService{

private EmployeesDao employeesDao;
	
	public EmployeesManager(EmployeesDao employeesDao) {
		super();
		this.employeesDao= employeesDao;
	}

	@Override
	public DataResult<List<Employees>> getAll() {
		this.employeesDao.findAll();
		return new SuccessDataResult<List<Employees>>("Data listelendi");
	}

	@Override
	public Result add(Employees employees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result update(Employees employees) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Employees> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
