package javacamp.hrms.dataAccess.abstracs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.ProgrammingSkillCV;

public interface ProgrammingSkillCVDao extends JpaRepository<ProgrammingSkillCV,Integer>{
	ProgrammingSkillCV getById(int id);
	List<ProgrammingSkillCV> getAllByCandidates_id(int id);
	
}
