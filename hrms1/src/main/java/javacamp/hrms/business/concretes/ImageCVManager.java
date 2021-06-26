package javacamp.hrms.business.concretes;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javacamp.hrms.business.abstracts.ImageCVService;
import javacamp.hrms.core.utilities.imageUpload.ImageUploadService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.core.utilities.results.SuccessDataResult;
import javacamp.hrms.core.utilities.results.SuccessResult;
import javacamp.hrms.dataAccess.abstracs.ImageCVDao;
import javacamp.hrms.entities.concretes.ImageCV;

@Service
public class ImageCVManager implements ImageCVService{
	
	private ImageCVDao imageCVDao;
	private ImageUploadService imageUploadService;


	@Autowired
	public ImageCVManager(ImageCVDao imageCVDao,ImageUploadService imageUploadService) {
		super();
		this.imageCVDao = imageCVDao;
		this.imageUploadService = imageUploadService;
		
	}
	
	@Override
	public Result add(ImageCV imageForCV , MultipartFile imageFile) {
		Map<String,String> uploadImage = this.imageUploadService.uploadImageFile(imageFile).getData();
		imageForCV.setUrl(uploadImage.get("url"));
		this.imageCVDao.save(imageForCV);
		return new SuccessResult("Resim eklendi");
	}

	@Override
	public Result update(ImageCV imageCV) {
		this.imageCVDao.save(imageCV);
		return new SuccessResult("Resim güncellendi");
	}

	@Override
	public Result delete(int id) {
		this.imageCVDao.deleteById(id);
		return new SuccessResult("Resim silindi");
	}

	@Override
	public DataResult<ImageCV> getById(int id) {
		return new SuccessDataResult<ImageCV>(this.imageCVDao.getById(id));
	}

	@Override
	public DataResult<List<ImageCV>> getAll() {
		return new SuccessDataResult<List<ImageCV>>(this.imageCVDao.findAll());
	}

	@Override
	public DataResult<ImageCV> getByCandidatesId(int id) {
		return new SuccessDataResult<ImageCV>(this.imageCVDao.getByCandidates_id(id));
	}



}
