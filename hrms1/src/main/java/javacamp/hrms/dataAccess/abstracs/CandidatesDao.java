package javacamp.hrms.dataAccess.abstracs;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.Candidates;


public interface CandidatesDao extends JpaRepository<Candidates,Integer>{
 Candidates findCandidateByNationalityId(String nationalityId);
 Candidates getById(int id);
}
