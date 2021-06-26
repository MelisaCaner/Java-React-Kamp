package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.LinkCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.LinkCVDao;
import javacamp.hrms.entities.concretes.LinkCV;

@Service
public class LinkCVManager implements LinkCVService{

private LinkCVDao linkCVDao;
	
	@Autowired
	public LinkCVManager(LinkCVDao linkCVDao) {
		super();
		this.linkCVDao = linkCVDao;
	}

	@Override
	public Result add(LinkCV linkCV) {
		this.linkCVDao.save(linkCV);
		return new SuccessResult("Link eklendi");
	}

	@Override
	public Result update(LinkCV linkCV) {
		this.linkCVDao.save(linkCV);
		return new SuccessResult("Link güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.linkCVDao.deleteById(id);
		return new SuccessResult("Link silindi");
	}

	@Override
	public DataResult<LinkCV> getById(int id) {
		return new SuccessDataResult<LinkCV>(this.linkCVDao.getById(id));
	}

	@Override
	public DataResult<List<LinkCV>> getAll() {
		return new SuccessDataResult<List<LinkCV>>(this.linkCVDao.findAll());
	}

	@Override
	public DataResult<List<LinkCV>> getAllByCandidatesId(int id) {
		return new SuccessDataResult<List<LinkCV>>(this.linkCVDao.getAllByCandidates_id(id));
	}
}
