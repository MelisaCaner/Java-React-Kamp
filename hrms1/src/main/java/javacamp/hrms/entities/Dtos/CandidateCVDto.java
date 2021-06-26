package javacamp.hrms.entities.Dtos;

import java.util.List;

import javacamp.hrms.entities.concretes.Candidates;
import javacamp.hrms.entities.concretes.ExperienceCV;
import javacamp.hrms.entities.concretes.ForeignLanguageCV;
import javacamp.hrms.entities.concretes.ImageCV;
import javacamp.hrms.entities.concretes.LinkCV;
import javacamp.hrms.entities.concretes.ProgrammingSkillCV;
import javacamp.hrms.entities.concretes.SchoolCV;

public class CandidateCVDto {
	
	public Candidates candidates;
	public List<SchoolCV> schools;
	public List<ProgrammingSkillCV> programingSkills;
	public List<LinkCV> links;
	public List<ForeignLanguageCV> languages;
	public List<ExperienceCV> experiences;
	public ImageCV image;
}
