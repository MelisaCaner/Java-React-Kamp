package javacamp.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "job_advertisement")
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "job_description")
	private String description;

	@Column(name = "min_pay")
	private double minPay;
	
	@Column(name = "max_pay")
	private double maxPay;
	
	@Column(name ="open_positions")
	private int openPositions;
	
	@Column(name ="deadline")
	private Date deadline;
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@ManyToOne
	@JoinColumn(name = "city_id")
	private Cities cities;
	
	@ManyToOne
	@JoinColumn(name = "jobtitle_id")
	private JobTitles jobTitle;
	
	@ManyToOne
	@JoinColumn(name = "employer_id")
	private Employers employers;
	
}
