package javacamp.hrms.dataAccess.abstracs;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.Employers;


public interface EmployersDao extends JpaRepository<Employers,Integer>{

}
