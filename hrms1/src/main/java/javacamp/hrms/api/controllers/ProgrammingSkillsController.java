package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.ProgrammingSkillCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.ProgrammingSkillCV;

@RestController
@RequestMapping("/api/programmingskills")
public class ProgrammingSkillsController {
	
	private ProgrammingSkillCVService programmingSkillCVService;

	@Autowired
	public ProgrammingSkillsController(ProgrammingSkillCVService programmingSkillCVService) {
		super();
		this.programmingSkillCVService = programmingSkillCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody ProgrammingSkillCV programmingSkillCV){
		return this.programmingSkillCVService.add(programmingSkillCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody ProgrammingSkillCV programmingSkillCV){
		return this.programmingSkillCVService.update(programmingSkillCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.programmingSkillCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<ProgrammingSkillCV> getById(@RequestParam("id") int id){
		return this.programmingSkillCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<ProgrammingSkillCV>> getAll(){
		return this.programmingSkillCVService.getAll();
	}
	
	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<ProgrammingSkillCV>> getAllByCandidatesId(@RequestParam int id){
		return this.programmingSkillCVService.getAllByCandidatesId(id);
	}

}
