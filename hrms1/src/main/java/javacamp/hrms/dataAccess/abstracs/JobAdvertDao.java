package javacamp.hrms.dataAccess.abstracs;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import javacamp.hrms.entities.concretes.JobAdvertisement;

public interface JobAdvertDao extends JpaRepository<JobAdvertisement,Integer > {
	@Query("From JobAdvertisement where isOpen = true")
	List<JobAdvertisement> getAllOpenJobAdvertisementList();

	@Query("From JobAdvertisement where isOpen = true Order By publishedAt Desc")
	List<JobAdvertisement> getAllByOrderByPublishedAtDesc();

	@Query("From JobAdvertisement where isOpen = true and employer_id =:id")
	List<JobAdvertisement> getAllOpenJobAdvertisementByEmployer(int id);
}
