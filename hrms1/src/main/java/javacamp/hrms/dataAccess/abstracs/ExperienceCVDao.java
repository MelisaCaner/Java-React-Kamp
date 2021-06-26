package javacamp.hrms.dataAccess.abstracs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.ExperienceCV;

public interface ExperienceCVDao extends JpaRepository<ExperienceCV, Integer> {
	ExperienceCV getById(int id);
	List<ExperienceCV> getAllByCandidates_idOrderByEndAtDesc(int id);
	List<ExperienceCV> getAllByCandidates_id(int id);

}
