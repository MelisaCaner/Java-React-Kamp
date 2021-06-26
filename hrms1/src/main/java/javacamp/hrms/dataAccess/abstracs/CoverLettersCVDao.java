package javacamp.hrms.dataAccess.abstracs;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.CoverLetterCV;

public interface CoverLettersCVDao extends JpaRepository<CoverLetterCV, Integer> {
	CoverLetterCV getById(int id);

}
