package javacamp.hrms.dataAccess.abstracs;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.VerificationCode;

public interface VerificationDao extends JpaRepository<VerificationCode,Integer>{
	VerificationCode getById(int id);
	
}
