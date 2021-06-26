package javacamp.hrms.dataAccess.abstracs;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.ForeignLanguageCV;

public interface ForeignLanguageCVDao extends JpaRepository<ForeignLanguageCV,Integer> {
	ForeignLanguageCV getById(int id);
	List<ForeignLanguageCV> getAllByCandidates_id(int id);

}
