package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.LinkCV;


public interface LinkCVService {
	Result add(LinkCV linkCv);
	Result update(LinkCV linkCv);
	Result delete(int id);
	DataResult<LinkCV> getById(int id);
	DataResult<List<LinkCV>> getAll();
	DataResult<List<LinkCV>> getAllByCandidatesId (int id);
}
