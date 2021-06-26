package javacamp.hrms.business.abstracts;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ImageCV;


public interface ImageCVService {
	Result add(ImageCV imageCv,MultipartFile imageFile);
	Result update(ImageCV imageCv);
	Result delete(int id);
	DataResult<ImageCV> getById(int id);
	DataResult<List<ImageCV>> getAll();
	DataResult<ImageCV> getByCandidatesId(int id);
	
	
}
