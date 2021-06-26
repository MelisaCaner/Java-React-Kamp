package javacamp.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javacamp.hrms.business.abstracts.JobtitleService;
import javacamp.hrms.core.utilities.results.DataResult;
import javacamp.hrms.core.utilities.results.Result;
import javacamp.hrms.entities.concretes.JobTitles;


@RestController
@RequestMapping("/api/jobtitles")
public class JobtitlesController {
	
	private JobtitleService jobtitleService;
	
	@Autowired
	public JobtitlesController(JobtitleService jobtitleService) {
		super();
		this.jobtitleService = jobtitleService;
	}

	@GetMapping("/getAll")
	public DataResult<List<JobTitles>> getAll() {
		return this.jobtitleService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitles jobtitles) {
		return this.jobtitleService.add(jobtitles);
	}
}
