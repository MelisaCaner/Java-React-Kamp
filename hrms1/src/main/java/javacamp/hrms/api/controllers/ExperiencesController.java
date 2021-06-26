package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.ExperienceCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ExperienceCV;


@RestController
@RequestMapping("/api/experiences")
public class ExperiencesController {
	
	private ExperienceCVService experienceCVService;

	@Autowired
	public ExperiencesController(ExperienceCVService experienceCVService) {
		super();
		this.experienceCVService = experienceCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ExperienceCV experienceCV){
		return this.experienceCVService.add(experienceCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ExperienceCV experienceCV){
		return this.experienceCVService.update(experienceCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.experienceCVService.delete(id);
	}
	
	@GetMapping("/getById")
	public DataResult<ExperienceCV> getById(@RequestParam int id){
		return this.experienceCVService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<ExperienceCV>> getAll(){
		return this.experienceCVService.getAll();
	}
	
	@GetMapping("/getAllByCandidatesIdOrderByEndAtDesc")
	public DataResult<List<ExperienceCV>> getAllByCandidatesIdOrderByEndAtDesc(@RequestParam("id") int id){
		return this.experienceCVService.getAllByCandidatesIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<ExperienceCV>> getAllByCandidatesId(@RequestParam int id){
		return this.experienceCVService.getAllByCandidatesId(id);
	}

}
