package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.ExperienceCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.ExperienceCVDao;
import javacamp.hrms.entities.concretes.ExperienceCV;

@Service
public class ExperienceCVManager implements ExperienceCVService{
	private ExperienceCVDao experienceCvDao;
	
	@Autowired
	 public ExperienceCVManager(ExperienceCVDao experienceCVDao) {
		super();
		this.experienceCvDao = experienceCVDao;
	}
	
	
	@Override
	public Result add(ExperienceCV experienceCV) {
		this.experienceCvDao.save(experienceCV);
		return new SuccessResult("Deneyim eklendi");
	}

	@Override
	public Result update(ExperienceCV experienceCV) {
		this.experienceCvDao.save(experienceCV);
		return new SuccessResult("Deneyim güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.experienceCvDao.deleteById(id);
		return new SuccessResult("Deneyim silindi");
	}

	@Override
	public DataResult<ExperienceCV> getById(int id) {
		return new SuccessDataResult<ExperienceCV>(this.experienceCvDao.getById(id));
	}

	@Override
	public DataResult<List<ExperienceCV>> getAll() {
		return new SuccessDataResult<List<ExperienceCV>>(this.experienceCvDao.findAll());
	}

	@Override
	public DataResult<List<ExperienceCV>> getAllByCandidatesIdOrderByEndAtDesc(int id) {
		return new SuccessDataResult<List<ExperienceCV>>(this.experienceCvDao.getAllByCandidates_idOrderByEndAtDesc(id));
	}

	@Override
	public DataResult<List<ExperienceCV>> getAllByCandidatesId(int id) {
		return new SuccessDataResult<List<ExperienceCV>>(this.experienceCvDao.getAllByCandidates_id(id));
	}
	
	
}
