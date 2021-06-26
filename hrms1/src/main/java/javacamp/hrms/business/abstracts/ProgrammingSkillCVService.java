package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ProgrammingSkillCV;

public interface ProgrammingSkillCVService {
	Result add(ProgrammingSkillCV programmingSkillCV);
	Result update (ProgrammingSkillCV programmingSkillCV);
	Result delete(int id);
	DataResult<ProgrammingSkillCV> getById(int id);
	DataResult<List<ProgrammingSkillCV>> getAll();
	DataResult<List<ProgrammingSkillCV>> getAllByCandidatesId(int id);
	
}
