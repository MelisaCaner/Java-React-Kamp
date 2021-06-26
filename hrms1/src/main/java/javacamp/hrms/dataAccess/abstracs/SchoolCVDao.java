package javacamp.hrms.dataAccess.abstracs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.SchoolCV;

public interface SchoolCVDao extends JpaRepository<SchoolCV,Integer>{
	SchoolCV getById(int id);
	List<SchoolCV>  getAllByCandidates_id(int id);
	List<SchoolCV> getAllByCandidates_idOrderByEndAtDesc(int id);
}
