package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javacamp.hrms.business.abstracts.CandidatesService;
import javacamp.hrms.business.abstracts.ImageCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Candidates;
import javacamp.hrms.entities.concretes.ImageCV;

@RestController
@RequestMapping("/api/images")
public class ImagesController {
	private ImageCVService imageCVService;
	private CandidatesService candidatesService;

	@Autowired
	public ImagesController(ImageCVService imageCVService, CandidatesService candidatesService) {
		super();
		this.imageCVService = imageCVService;
		this.candidatesService = candidatesService;
	}
	
	@PostMapping(value = "/add")
	public Result add(@RequestParam(value = "id") int id, @RequestParam(value = "imageFile") MultipartFile imageFile){
		Candidates candidates = this.candidatesService.getById(id).getData();
		ImageCV imageCV = new ImageCV();
		imageCV.setCandidates(candidates);
		return this.imageCVService.add(imageCV, imageFile);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ImageCV imageCV){
		return this.imageCVService.update(imageCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.imageCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ImageCV> getById(@RequestParam("id") int id){
		return this.imageCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ImageCV>> getAll(){
		return this.imageCVService.getAll();
	}
	
	
	@GetMapping("/getByCandidatesId")
	public DataResult<ImageCV> getByCandidatesId(@RequestParam int id){
		return this.imageCVService.getByCandidatesId(id);
	}

}
