 package kodlamaio.HRMS.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.JobSeekersServiceDao;
import kodlamaio.HRMS.Entities.concretes.JobSeekers;
import kodlamaio.HRMS.Entities.concretes.SystemWorkers;
import kodlamaio.HRMS.business.abstracts.JobSeekersService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;
@Service
public class JobSeekersServiceManager implements JobSeekersService{
	
	
	private JobSeekersServiceDao jsservicedao;

	@Override
	public boolean RegisterStep1(JobSeekers jobseekers) {

		if(jobseekers.getJsEmail().isEmpty()) {
			System.out.println("Email bulunamadı.");
			return false;
		}
		System.out.println("Email sistemde bulundu."+jobseekers.getJsEmail());
		return true;
	}
		
	

	@Override
	public boolean EmailVerification(JobSeekers jobseekers) {
		
		String emailRegex="^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPat= Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher= emailPat.matcher(jobseekers.getJsEmail());
		System.out.println("Email doğrulanması sona erdi."+jobseekers.getJsEmail());
		return matcher.find();
	}



	@Override
	public DataResult<List<JobSeekers>> getAll() {
		return new SuccessDataResult<List<JobSeekers>>(this.jsservicedao.findAll());
	}


	@Override
	public DataResult<JobSeekers> getByJsFirstNameAndJsLastName(String jsFirstName, String jsLastName) {
		
		return new SuccessDataResult<JobSeekers>(this.jsservicedao.getByJsFirstNameAndJsLastName(jsFirstName, jsLastName));
	}

	

}
