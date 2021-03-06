package javacamp.hrms.dataAccess.abstracs;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.JobTitles;


public interface JobTitlesDao extends JpaRepository<JobTitles,Integer>{

	JobTitles getByJobTitle(String title);
	JobTitles getById(int id);
	
}
