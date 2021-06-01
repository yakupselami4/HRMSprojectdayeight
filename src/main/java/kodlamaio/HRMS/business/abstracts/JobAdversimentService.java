package kodlamaio.HRMS.business.abstracts;

import kodlamaio.HRMS.Entities.concretes.JobAdversiment;
import kodlamaio.HRMS.core.utilities.results.DataResult;

public interface JobAdversimentService {
	
	DataResult<JobAdversiment> getByJobCityNameAndJobPositionName(String jobCityName,String jobPositionName);
	
	DataResult<JobAdversiment> getByJobAdvOpeningDateAndJobAdvClosingDate(String jobAdvOpeningDate,String jobAdvClosingDate);

}
