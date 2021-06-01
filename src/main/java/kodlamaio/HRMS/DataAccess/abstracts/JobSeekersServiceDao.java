package kodlamaio.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.JobSeekers;


public interface JobSeekersServiceDao extends JpaRepository<JobSeekers,Integer>{
	
	JobSeekers getByJsFirstNameAndJsLastName(String jsFirstName,String jsLastName);

}
