package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.ForeignLanguageCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ForeignLanguageCV;

@RestController
@RequestMapping("/api/foreignlanguages")
public class ForeignLanguagesController {
	private ForeignLanguageCVService foreignLanguageCVService;

	@Autowired
	public ForeignLanguagesController(ForeignLanguageCVService foreignLanguageCVService) {
		super();
		this.foreignLanguageCVService = foreignLanguageCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ForeignLanguageCV foreignLanguageCV){
		return this.foreignLanguageCVService.add(foreignLanguageCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ForeignLanguageCV foreignLanguageCV){
		return this.foreignLanguageCVService.update(foreignLanguageCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.foreignLanguageCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ForeignLanguageCV> getById(@RequestParam("id") int id){
		return this.foreignLanguageCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ForeignLanguageCV>> getAll(){
		return this.foreignLanguageCVService.getAll();
	}
	
	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<ForeignLanguageCV>> getAllByCandidatesId(@RequestParam int id){
		return this.foreignLanguageCVService.getAllByCandidatesId(id);
	}

}
