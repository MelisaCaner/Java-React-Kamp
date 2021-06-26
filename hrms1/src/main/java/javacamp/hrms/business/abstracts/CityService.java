package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Cities;

public interface CityService {
	Result add(Cities cities);
	Result update(Cities cities);
	Result delete(int id);
	DataResult<Cities> getById(int id);
	DataResult<List<Cities>> getAll();


}
