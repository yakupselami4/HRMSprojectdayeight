package kodlamaio.HRMS.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="job_seekers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
public class JobSeekers extends Users{
	


	@PrimaryKeyJoinColumn(name="js_id", referencedColumnName = "id")
	private int js_id;
	
	@Column(name="js_first_name")
	private String jsFirstName;
	
	@Column(name="js_last_name")
	private String jsLastName;
	
	@Column(name="js_nationality_id")
	private String jsNationalityId;
	
	@Column(name="jd_email")
	private String jsEmail;
	
	@Column(name="js_password")
	private String jsPassword;
	
	@Column(name="js_password_repeat")
	private String jsPasswordRepeat;
	

}
