package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.LinkCVService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.LinkCV;

@RestController
@RequestMapping("/api/links")
public class LinksController {
	
	private LinkCVService linkCVService;

	@Autowired
	public LinksController(LinkCVService linkCVService) {
		super();
		this.linkCVService = linkCVService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody LinkCV linkCV){
		return this.linkCVService.add(linkCV);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody LinkCV linkCV){
		return this.linkCVService.update(linkCV);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.linkCVService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<LinkCV> getById(@RequestParam("id") int id){
		return this.linkCVService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<LinkCV>> getAll(){
		return this.linkCVService.getAll();
	}
	
	@GetMapping("/getAllByCandidatesId")
	public DataResult<List<LinkCV>> getAllByCandidatesId(@RequestParam int id){
		return this.linkCVService.getAllByCandidatesId(id);
	}

}
