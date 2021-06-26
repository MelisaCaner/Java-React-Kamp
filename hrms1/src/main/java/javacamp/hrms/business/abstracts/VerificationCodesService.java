package javacamp.hrms.business.abstracts;

import java.util.List;


import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.VerificationCode;

public interface VerificationCodesService {
	Result add(VerificationCode verificationcode);
	Result update (VerificationCode verificationcode);
	Result delete(int id);
	
	DataResult<VerificationCode> getById(int id);
	DataResult<List<VerificationCode>> getAll();
	
	

}
