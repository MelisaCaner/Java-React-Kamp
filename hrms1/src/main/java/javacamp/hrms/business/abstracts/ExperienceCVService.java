package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ExperienceCV;

public interface ExperienceCVService {
	Result add(ExperienceCV experienceCV);
	Result update(ExperienceCV experienceCV);
	Result delete(int id);
	DataResult<ExperienceCV> getById(int id);	
	DataResult<List<ExperienceCV>> getAll();
	DataResult<List<ExperienceCV>> getAllByCandidatesIdOrderByEndAtDesc(int id);
	DataResult<List<ExperienceCV>> getAllByCandidatesId(int id);

}
