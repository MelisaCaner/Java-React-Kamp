package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.CityService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Cities;

@RestController
@RequestMapping("/api/cities")
public class CitiesController {
	private CityService cityService;

	@Autowired
	public CitiesController(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Cities city){
		return this.cityService.add(city);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Cities city){
		return this.cityService.update(city);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.cityService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<Cities> getById(@RequestParam("id") int id){
		return this.cityService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Cities>> getAll(){
		return this.cityService.getAll();
	}

}
