package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.CoverLetterCV;

public interface CoverLetterCVService {
	Result add(CoverLetterCV coverLetterCV);
	Result update(CoverLetterCV coverLetterCV);
	Result delete(int id);
	DataResult<CoverLetterCV> getById(int id);	
	DataResult<List<CoverLetterCV>> getAll();
}
