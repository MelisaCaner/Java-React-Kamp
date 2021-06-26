package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cv_foreign_languages")
@EqualsAndHashCode(callSuper=false)
public class ForeignLanguageCV extends Base{

	@Column(name = "language")
	private String language;
	
	@Min(value = 1)
	@Max(value = 10)
	@Column(name = "level")
	private int level;	

	@ManyToOne()
	@JoinColumn(name = "candidates_id")
	private Candidates candidates;
}
