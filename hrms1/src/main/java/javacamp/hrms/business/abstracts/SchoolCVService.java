package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.SchoolCV;

public interface SchoolCVService {
	Result add(SchoolCV schoolCV);
	Result update(SchoolCV schoolCV);
	Result delete(int id);
	DataResult<List<SchoolCV>> getAll();
	DataResult<List<SchoolCV>> getAllByCandidatesIdOrderByEndAtDesc(int id);
	DataResult<List<SchoolCV>> getAllByCandidatesId(int id);
	DataResult<SchoolCV> getById(int id);
	
	
	

}
