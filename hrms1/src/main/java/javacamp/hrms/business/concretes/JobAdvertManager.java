package javacamp.hrms.business.concretes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javacamp.hrms.business.abstracts.JobAdvertService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.ErrorResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.JobAdvertDao;
import javacamp.hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertManager implements JobAdvertService{
	private JobAdvertDao jobAdvertDao;

	@Autowired
	public JobAdvertManager(JobAdvertDao jobAdvertDao) {
	this.jobAdvertDao = jobAdvertDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
	this.jobAdvertDao.save(jobAdvertisement);
	return new SuccessResult("Data eklenmiştir");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
	this.jobAdvertDao.save(jobAdvertisement);
	return new SuccessResult("Data güncellenmiştir");
	}

	@Override
	public DataResult<JobAdvertisement> getById(int jobAdvertId) {
	return new SuccessDataResult<JobAdvertisement>
	(this.jobAdvertDao.getById(jobAdvertId));
	}



	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertList() {
	this.jobAdvertDao.findAll();
	return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi");
	}



	@Override
	public DataResult<List<JobAdvertisement>> getAllActiveJobAdvertByEmployer(int id) {
	this.jobAdvertDao.getAllOpenJobAdvertisementByEmployer(id);
	return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi.");
	}



	@Override
	public DataResult<List<JobAdvertisement>> getAllByOrderByPublishedAt() {
	this.jobAdvertDao.getAllByOrderByPublishedAtDesc();
	return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi");
	}



	@Override
	public Result changeActivityStatus(int id) {
	if(getById(id)==null) {
	return new ErrorResult("Böyle bir iş ilanı mevcut değil");
	}
	if(getById(id).getData().isActive()==false) {
	return new ErrorResult("Bu iş ilanı aktif değildir");
	}
	JobAdvertisement jobAdvertisement = getById(id).getData();
	jobAdvertisement.setActive(false);
	update(jobAdvertisement);
	return new SuccessResult("Data pasif hale getirilmiştir");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertDao.deleteById(id);
		return new SuccessResult("İş ilanı silindi");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		this.jobAdvertDao.findAll();
		return new SuccessDataResult<List<JobAdvertisement>>("Data listelendi");
	}
}
