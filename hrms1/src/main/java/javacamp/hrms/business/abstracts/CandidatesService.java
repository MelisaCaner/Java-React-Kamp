package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.Dtos.CandidateCVDto;
import javacamp.hrms.entities.concretes.Candidates;

public interface CandidatesService {

	Result add(Candidates candidates);

	Result update(Candidates candidates);

	Result delete(int id);

	DataResult<Candidates> getById(int id);

	DataResult<List<Candidates>> getAll();

	DataResult<Candidates> getCandidateByNationalityId(String nationalityId);

	DataResult<CandidateCVDto> getCandidateCvById(int id);

}
