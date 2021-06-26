package javacamp.hrms.business.abstracts;

import java.util.List;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.JobTitles;


public interface JobtitleService {
	DataResult<List<JobTitles>> getAll();
	Result add(JobTitles jobtitles);
	DataResult<JobTitles> getJobByTitle(String title);
}
