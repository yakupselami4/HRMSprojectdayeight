package kodlamaio.HRMS.Entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="job_adversiments")
@NoArgsConstructor
@AllArgsConstructor

public class JobAdversiment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_adversiment_id")
	private int jobAdversimentId;
	
	
	@Column(name="min_salary")
	private int minSalary;
	
	@Column(name="max_salary")
	private int maxSalary;
	
	@Column(name="job_position_name")
	private String jobPositionName;
	
	@Column(name="job_city_name")
	private String jobCityName;
	
	@Column(name="employer_name")
	private String employerName;
	
	@Column(name="job_opening_Date")
	private String jobAdvOpeningDate;
	
	@Column(name="job_closing_Date")
	private String jobAdvClosingDate;
	
	@Column(name="open_positions_number")
	private int openPositionsNumber;

}
