package javacamp.hrms.entities.concretes;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name="user_id")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="candidates")
public class Candidates extends Users {
	
	//@Id
	//@Column(name = "id")
	//private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "nationality_id")
	private String nationalityId;
	
	@Column(name ="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<SchoolCV> schools;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<ProgrammingSkillCV> programingSkills;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<LinkCV> links;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<ForeignLanguageCV> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<ExperienceCV> experiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "candidates")
	private List<CoverLetterCV> coverLetters;
	
	@JsonIgnore
	@OneToOne(mappedBy = "candidates")
	private ImageCV image;
	
}
