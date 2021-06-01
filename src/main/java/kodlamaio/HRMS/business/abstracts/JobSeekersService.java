package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Component;

import kodlamaio.HRMS.Entities.concretes.JobSeekers;
import kodlamaio.HRMS.core.utilities.results.DataResult;
@Component
public interface JobSeekersService {
	public boolean RegisterStep1(JobSeekers jobseekers);
	public boolean EmailVerification(JobSeekers jobseekers);
	
	
	DataResult<List<JobSeekers>> getAll();
	
	DataResult<JobSeekers> getByJsFirstNameAndJsLastName(String jsFirstName,String jsLastName);
	

}
