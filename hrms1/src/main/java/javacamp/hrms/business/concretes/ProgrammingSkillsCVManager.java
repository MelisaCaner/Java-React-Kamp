package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.ProgrammingSkillCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.ProgrammingSkillCVDao;
import javacamp.hrms.entities.concretes.ProgrammingSkillCV;

@Service
public class ProgrammingSkillsCVManager implements ProgrammingSkillCVService{

	private ProgrammingSkillCVDao programmingSkillCVDao;
	
	
	@Autowired
	public ProgrammingSkillsCVManager(ProgrammingSkillCVDao programmingSkillCVDao) {
		super();
		this.programmingSkillCVDao = programmingSkillCVDao;
	}

	@Override
	public Result add(ProgrammingSkillCV programmingSkillCV) {
		this.programmingSkillCVDao.save(programmingSkillCV);
		return new SuccessResult("Programlama becerisi eklendi");
	}

	@Override
	public Result update(ProgrammingSkillCV programmingSkillCV) {
		this.programmingSkillCVDao.save(programmingSkillCV);
		return new SuccessResult("Programlama becerisi güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.programmingSkillCVDao.deleteById(id);
		return new SuccessResult("Programlama becerisi silindi");
	}

	@Override
	public DataResult<ProgrammingSkillCV> getById(int id) {
		return new SuccessDataResult<ProgrammingSkillCV>(this.programmingSkillCVDao.getById(id));
	}

	@Override
	public DataResult<List<ProgrammingSkillCV>> getAll() {
		return new SuccessDataResult<List<ProgrammingSkillCV>>(this.programmingSkillCVDao.findAll());
	}

	@Override
	public DataResult<List<ProgrammingSkillCV>> getAllByCandidatesId(int id) {
		return new SuccessDataResult<List<ProgrammingSkillCV>>(this.programmingSkillCVDao.getAllByCandidates_id(id));
	}
}
