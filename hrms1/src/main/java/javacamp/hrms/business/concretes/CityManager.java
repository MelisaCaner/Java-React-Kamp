package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CityService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.CityDao;
import javacamp.hrms.entities.concretes.Cities;
@Service
public class CityManager implements CityService{
	private CityDao cityDao;
	
	public CityManager(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Result add(Cities cities) {
		this.cityDao.save(cities);
		return new SuccessResult("Şehir eklendi");
	}

	@Override
	public Result update(Cities cities) {
		this.cityDao.save(cities);
		return new SuccessResult("Şehir güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.cityDao.deleteById(id);
		return new SuccessResult("Şehir silindi");
	}

	@Override
	public DataResult<Cities> getById(int id) {
		return new SuccessDataResult<Cities>(this.cityDao.getById(id));
	}

	@Override
	public DataResult<List<Cities>> getAll() {
		return new SuccessDataResult<List<Cities>>(this.cityDao.findAll());
	}
	
	

}
