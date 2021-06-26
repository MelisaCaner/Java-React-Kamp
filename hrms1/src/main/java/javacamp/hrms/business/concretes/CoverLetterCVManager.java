package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CoverLetterCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.CoverLettersCVDao;
import javacamp.hrms.entities.concretes.CoverLetterCV;

@Service
public class CoverLetterCVManager implements CoverLetterCVService{

	private CoverLettersCVDao covverLettersCvDao;
	
	public CoverLetterCVManager(CoverLettersCVDao coverLettersCvDao) {
		super();
		this.covverLettersCvDao = coverLettersCvDao;
	}
	
	
	@Override
	public Result add(CoverLetterCV coverLetterCV) {
		this.covverLettersCvDao.save(coverLetterCV);
		return new SuccessResult("Ön yazı eklendi");
	}

	@Override
	public Result update(CoverLetterCV coverLetterCV) {
		this.covverLettersCvDao.save(coverLetterCV);
		return new SuccessResult("Ön yazı güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.covverLettersCvDao.deleteById(id);
		return new SuccessResult("Ön yazı silindi");
	}

	@Override
	public DataResult<CoverLetterCV> getById(int id) {
		return new SuccessDataResult<CoverLetterCV>(this.covverLettersCvDao.getById(id));
	}

	@Override
	public DataResult<List<CoverLetterCV>> getAll() {
		return new SuccessDataResult<List<CoverLetterCV>>(this.covverLettersCvDao.findAll());
	}
	
 
}
