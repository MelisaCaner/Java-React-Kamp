package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.SchoolCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.SchoolCVDao;
import javacamp.hrms.entities.concretes.SchoolCV;

@Service
public class SchoolCVManager implements SchoolCVService{
	private SchoolCVDao schoolCVDao;
	
	@Autowired
	public SchoolCVManager(SchoolCVDao schoolCVDao) {
		super();
		this.schoolCVDao = schoolCVDao;
	}

	@Override
	public Result add(SchoolCV schoolCV) {
		this.schoolCVDao.save(schoolCV);
		return new SuccessResult("School has been added.");
	}

	@Override
	public Result update(SchoolCV schoolCV) {
		this.schoolCVDao.save(schoolCV);
		return new SuccessResult("School has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.schoolCVDao.deleteById(id);
		return new SuccessResult("School has been deleted.");
	}

	
	@Override
	public DataResult<SchoolCV> getById(int id) {
		return new SuccessDataResult<SchoolCV>(this.schoolCVDao.getById(id));
	}

	@Override
	public DataResult<List<SchoolCV>> getAll() {
		return new SuccessDataResult<List<SchoolCV>>(this.schoolCVDao.findAll());
	}

	@Override
	public DataResult<List<SchoolCV>> getAllByCandidatesIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<SchoolCV>>(this.schoolCVDao.getAllByCandidates_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<SchoolCV>> getAllByCandidatesId(int id) {
		return new SuccessDataResult<List<SchoolCV>>(this.schoolCVDao.getAllByCandidates_id(id));
	}
}
