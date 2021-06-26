package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ForeignLanguageCV;

public interface ForeignLanguageCVService {
	Result add(ForeignLanguageCV foreignLanguageCV);
	Result update(ForeignLanguageCV foreignLanguageCV);
	Result delete(int id);
	DataResult<ForeignLanguageCV> getById(int id);	
	DataResult<List<ForeignLanguageCV>> getAll();
	DataResult<List<ForeignLanguageCV>> getAllByCandidatesId(int id);

}
