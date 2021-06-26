package javacamp.hrms.dataAccess.abstracs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.LinkCV;

public interface LinkCVDao extends JpaRepository<LinkCV, Integer>{
	
	LinkCV getById(int id);
	List<LinkCV> getAllByCandidates_id(int id);
	
}
