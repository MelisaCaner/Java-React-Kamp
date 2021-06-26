package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.JobtitleService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.ErrorResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.JobTitlesDao;
import javacamp.hrms.entities.concretes.JobTitles;


@Service
public class JobTitlesManager implements JobtitleService {
	private JobTitlesDao jobtitlesDao;

	@Autowired
	public JobTitlesManager(JobTitlesDao jobtitlesDao) {
		super();
		this.jobtitlesDao = jobtitlesDao;
	}

	@Override
	public Result add(JobTitles jobtitles) {
		if(getJobByTitle(jobtitles.getJobTitle()).getData() != null) {
			return new ErrorResult(jobtitles.getJobTitle()+ "zaten böyle bir pozisyon tanımlı");
		}
		this.jobtitlesDao.save(jobtitles);
		return new SuccessResult("Pozisyon eklendi");
	}

	@Override
	public DataResult<List<JobTitles>> getAll() {

		return new SuccessDataResult<List<JobTitles>>(this.jobtitlesDao.findAll(), "Data Listelendi");

	}

	@Override
	public DataResult<JobTitles> getJobByTitle(String title) {
		this.jobtitlesDao.getByJobTitle(title);
		return new SuccessDataResult<JobTitles>();
	}

}