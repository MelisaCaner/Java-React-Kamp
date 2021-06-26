package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.ForeignLanguageCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.ForeignLanguageCVDao;
import javacamp.hrms.entities.concretes.ForeignLanguageCV;

@Service
public class ForeignLanguageCVManager implements ForeignLanguageCVService {
	
	private ForeignLanguageCVDao foreignLanguageCvDao;
	
	@Autowired
	public ForeignLanguageCVManager(ForeignLanguageCVDao foreignLanguageForCvDao) {
		super();
		this.foreignLanguageCvDao = foreignLanguageForCvDao;
	}
	

	@Override
	public Result add(ForeignLanguageCV foreignLanguageCV) {
		this.foreignLanguageCvDao.save(foreignLanguageCV);
		return new SuccessResult("Yabancı dil bilgisi eklendi");
	}

	@Override
	public Result update(ForeignLanguageCV foreignLanguageCV) {
		this.foreignLanguageCvDao.save(foreignLanguageCV);
		return new SuccessResult("Yabancı dil bilgisi güncellendi");
	}
	

	@Override
	public Result delete(int id) {
		this.foreignLanguageCvDao.deleteById(id);;
		return new SuccessResult("Yabancı Dil bilgisi silindi");
	}

	@Override
	public DataResult<ForeignLanguageCV> getById(int id) {
		return new SuccessDataResult<ForeignLanguageCV>(this.foreignLanguageCvDao.getById(id));
	}

	@Override
	public DataResult<List<ForeignLanguageCV>> getAll() {
		return new SuccessDataResult<List<ForeignLanguageCV>>(this.foreignLanguageCvDao.findAll());
	}

	@Override
	public DataResult<List<ForeignLanguageCV>> getAllByCandidatesId(int id) {
		return new SuccessDataResult<List<ForeignLanguageCV>>(this.foreignLanguageCvDao.getAllByCandidates_id(id));
	}
	

}
