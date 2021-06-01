package kodlamaio.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.JobAdversiment;


public interface JobAdversimentServiceDao extends JpaRepository<JobAdversiment,Integer> {
	
	JobAdversiment getByJobCityNameAndJobPositionName(String jobCityName,String jobPositionName);
	
	JobAdversiment getByJobAdvOpeningDateAndJobAdvClosingDate(String jobAdvOpeningDate,String jobAdvClosingDate);

}
