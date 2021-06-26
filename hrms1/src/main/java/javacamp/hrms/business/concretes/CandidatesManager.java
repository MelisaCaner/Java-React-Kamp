package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.CandidatesService;
import javacamp.hrms.business.abstracts.ExperienceCVService;
import javacamp.hrms.business.abstracts.ForeignLanguageCVService;
import javacamp.hrms.business.abstracts.ImageCVService;
import javacamp.hrms.business.abstracts.LinkCVService;
import javacamp.hrms.business.abstracts.ProgrammingSkillCVService;
import javacamp.hrms.business.abstracts.SchoolCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.CandidatesDao;
import javacamp.hrms.entities.Dtos.CandidateCVDto;
import javacamp.hrms.entities.concretes.Candidates;

@Service
public class CandidatesManager implements CandidatesService {
	
	private CandidatesDao candidatesDao;
	
	private ExperienceCVService experienceCVService;
	private ForeignLanguageCVService foreignLanguageCVService;
	private ImageCVService imageCVService;
	private LinkCVService linkCVService;
	private ProgrammingSkillCVService programmingSkillCVService;
	private SchoolCVService schoolCVService;

	public CandidatesManager(CandidatesDao candidatesDao, ExperienceCVService experienceCVService,
			ForeignLanguageCVService foreignLanguageCVService, ImageCVService imageCVService,
			LinkCVService linkCVService, ProgrammingSkillCVService programmingSkillCVService,
			SchoolCVService schoolCVService) {
		super();
		this.candidatesDao = candidatesDao;
		this.experienceCVService = experienceCVService;
		this.foreignLanguageCVService = foreignLanguageCVService;
		this.imageCVService = imageCVService;
		this.linkCVService = linkCVService;
		this.programmingSkillCVService = programmingSkillCVService;
		this.schoolCVService = schoolCVService;
	}
	
	@Override
	public Result add(Candidates candidates) {
		this.candidatesDao.save(candidates);
		return new SuccessResult("Aday eklendi");
	}

	@Override
	public Result update(Candidates candidates) {
		this.candidatesDao.save(candidates);
		return new SuccessResult("Aday güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.candidatesDao.deleteById(id);
		return new SuccessResult("Aday silindi");
	}

	@Override
	public DataResult<Candidates> getById(int id) {
		return new SuccessDataResult<Candidates>(this.candidatesDao.getById(id));
	}

	@Override
	public DataResult<List<Candidates>> getAll() {
		return new SuccessDataResult<List<Candidates>>(this.candidatesDao.findAll());
	}

	@Override
	public DataResult<Candidates> getCandidateByNationalityId(String nationalityId) {
		return new SuccessDataResult<Candidates>(this.candidatesDao.findCandidateByNationalityId(nationalityId));
	}

	@Override
	public DataResult<CandidateCVDto> getCandidateCvById(int id) {
		Candidates candidates = this.candidatesDao.getById(id);
		CandidateCVDto cv = new CandidateCVDto();
		cv.experiences = candidates.getExperiences();
		cv.languages = candidates.getLanguages();
	//	cv.image = candidates.getImage();
		cv.links = candidates.getLinks();
		cv.programingSkills = candidates.getProgramingSkills();
		cv.schools = candidates.getSchools();
		return new SuccessDataResult<CandidateCVDto>(cv);
	}
}
