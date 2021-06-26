package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.UserService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.Users;

@RestController
@RequestMapping("/api/users")
public class UsersController {
	
	private UserService userService;

	@Autowired
	public UsersController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Users user){
		return this.userService.add(user);
	}
	
	@PostMapping("/update")
	public Result update(@RequestBody Users user){
		return this.userService.update(user);
	}
	
	@PostMapping("/delete")
	public Result delete(@RequestParam("id") int id){
		return this.userService.delete(id);
	}
	
	@GetMapping("/getbyid")
	public DataResult<Users> getById(@RequestParam("id") int id){
		return this.userService.getById(id);
	}
	
	@GetMapping("/getall")
	public DataResult<List<Users>> getAll(){
		return this.userService.getAll();
	}
}
