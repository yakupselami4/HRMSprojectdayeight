package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.DataAccess.abstracts.JobAdversimentServiceDao;
import kodlamaio.HRMS.Entities.concretes.JobAdversiment;
import kodlamaio.HRMS.business.abstracts.JobAdversimentService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;

public class JobAdversimentManager implements JobAdversimentService{

	private JobAdversimentServiceDao jobadvservicedao;
	
	@Override
	public DataResult<JobAdversiment> getByJobCityNameAndJobPositionName(String jobCityName, String jobPositionName) {
		return new SuccessDataResult<JobAdversiment>(this.jobadvservicedao.getByJobCityNameAndJobPositionName(jobCityName, jobPositionName));
	}

	@Override
	public DataResult<JobAdversiment> getByJobAdvOpeningDateAndJobAdvClosingDate(String jobAdvOpeningDate,
			String jobAdvClosingDate) {
		return new SuccessDataResult<JobAdversiment>(this.jobadvservicedao.getByJobAdvOpeningDateAndJobAdvClosingDate(jobAdvOpeningDate, jobAdvClosingDate));
	}

}
