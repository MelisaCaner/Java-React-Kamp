package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.SchoolCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.SchoolCV;

@RestController
@RequestMapping("/api/school")
public class SchoolsController {
	
	private SchoolCVService schoolCVService;

	@Autowired
	public SchoolsController(SchoolCVService schoolCVService) {
		super();
		this.schoolCVService = schoolCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody SchoolCV schoolCV){
		return this.schoolCVService.add(schoolCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody SchoolCV schoolCV){
		return this.schoolCVService.update(schoolCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam int id){
		return this.schoolCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<SchoolCV> getById(@RequestParam int id){
		return this.schoolCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<SchoolCV>> getAll(){
		return this.schoolCVService.getAll();
	}
	
	@GetMapping("/getAllByCandidatesIdOrderByEndAtDesc")
	public DataResult<List<SchoolCV>> getAllByCandidatesIdOrderByEndAtDesc(@RequestParam int id){
		return this.schoolCVService.getAllByCandidatesIdOrderByEndAtDesc(id);
	}
	
	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<SchoolCV>> getAllByCandidatesId(@RequestParam int id){
		return this.schoolCVService.getAllByCandidatesId(id);
	}
}
