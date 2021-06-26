package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "cv_cover_letters")
@EqualsAndHashCode(callSuper = false)
public class CoverLetterCV extends Base {

	@Column(name = "content")
	private String content;
	
	@ManyToOne
	@JoinColumn(name = "candidate_id")
	@JsonIgnore
	private Candidates candidates;

	public CoverLetterCV(String content,int candidateId) {
		super();
		this.content = content;
		this.candidates.setId(candidateId);
	}

}
