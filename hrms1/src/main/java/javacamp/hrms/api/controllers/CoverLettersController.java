package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.CoverLetterCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.CoverLetterCV;

@RestController
@RequestMapping("/api/coverletter")
public class CoverLettersController {
	private CoverLetterCVService coverLetterCVService;

	@Autowired
	public CoverLettersController(CoverLetterCVService coverLetterCVService) {
		super();
		this.coverLetterCVService = coverLetterCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody CoverLetterCV coverLetterCV){
		return this.coverLetterCVService.add(coverLetterCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody CoverLetterCV coverLetterCV){
		return this.coverLetterCVService.update(coverLetterCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.coverLetterCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<CoverLetterCV> getById(@RequestParam("id") int id){
		return this.coverLetterCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<CoverLetterCV>> getAll(){
		return this.coverLetterCVService.getAll();
	}
}
