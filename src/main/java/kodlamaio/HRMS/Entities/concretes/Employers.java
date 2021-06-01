package kodlamaio.HRMS.Entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity
@Table(name="employers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)

public class Employers extends Users{
	
	

	@PrimaryKeyJoinColumn(name="corp_id", referencedColumnName = "id")
	private int corp_id;
	
	@Column(name="corp_name")
	private String corpName;
	
	@Column(name="corp_website")
	private String corpWebsite;
	
	@Column(name="corp_email")
	private String corpEmail;
	
	@Column(name="corp_phone")
	private String corpPhone;
	
	@Column(name="corp_password")
	private String corpPassword;
	
	@Column(name="corp_password_repeat")
	private String corpPasswordRepeat;
	
	


}
