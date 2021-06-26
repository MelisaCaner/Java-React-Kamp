package javacamp.hrms.dataAccess.abstracs;

import org.springframework.data.jpa.repository.JpaRepository;

import javacamp.hrms.entities.concretes.ImageCV;

public interface ImageCVDao extends JpaRepository<ImageCV, Integer>{
	ImageCV getById(int id);
	ImageCV getByCandidates_id(int id);

}
