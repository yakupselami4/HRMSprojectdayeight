package kodlamaio.HRMS.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="system_workers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)

public class SystemWorkers extends Users{

	@PrimaryKeyJoinColumn(name="sys_id", referencedColumnName = "id")
	private int sys_id;
	
	@Column(name="sys_first_name")
	private String sysFirstName;
	
	@Column(name="sys_last_name")
	private String sysLastName;
	
	@Column(name="sys_email")
	private String sysEmail;
		
	
}
