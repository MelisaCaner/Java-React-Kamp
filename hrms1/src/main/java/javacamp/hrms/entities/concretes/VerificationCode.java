package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="verification_codes")
public class VerificationCode {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "is_verified")
	private Boolean isVerified;
	
	@Column(name = "verified_date")
	private Boolean verifiedDate;

	public VerificationCode(int id, String code, Boolean isVerified) {
		super();
		this.id = id;
		this.code = code;
		this.isVerified = isVerified;
	}
	
	
}
