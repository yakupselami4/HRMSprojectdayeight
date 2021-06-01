package kodlamaio.HRMS.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.HRMS.DataAccess.abstracts.EmployersServiceDao;
import kodlamaio.HRMS.DataAccess.abstracts.JobAdversimentServiceDao;
import kodlamaio.HRMS.DataAccess.abstracts.JobSeekersServiceDao;
import kodlamaio.HRMS.DataAccess.abstracts.SystemWorkersServiceDao;
import kodlamaio.HRMS.Entities.concretes.Employers;
import kodlamaio.HRMS.Entities.concretes.JobAdversiment;
import kodlamaio.HRMS.Entities.concretes.JobSeekers;
import kodlamaio.HRMS.Entities.concretes.Positions;
import kodlamaio.HRMS.Entities.concretes.SystemWorkers;
import kodlamaio.HRMS.business.abstracts.JobPositionService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;

@RestController
@RequestMapping("/api")
public class UsersController {
	
	@Autowired
	
	private EmployersServiceDao employersdao;
	private JobSeekersServiceDao jobseekersdao;
	private SystemWorkersServiceDao systemworkersdao;
	private JobPositionService jobpositiondao;
	private JobAdversimentServiceDao jobadvdao;
	
	@GetMapping("/getByProductName")
	public DataResult<Employers> getByCorpName(@RequestParam String corpName){
		return new SuccessDataResult<Employers>(this.employersdao.getByCorpName(corpName),"Şirketin İsmi kaydedildi.");	
	}
	
	
	@GetMapping("/getByCorpWebsite")
	public DataResult<Employers> getByCorpWebsite(@RequestParam String corpWebsite){
		return new SuccessDataResult<Employers>(this.employersdao.getByCorpWebsite(corpWebsite),"Site başarıyla kaydedildi.");	
	}
	
	
	@GetMapping("/getByCorpPhone")
	public DataResult<Employers> getByCorpPhone(@RequestParam String corpPhone){
		return new SuccessDataResult<Employers>(this.employersdao.getByCorpPhone(corpPhone),"Şirketin iletişim bilgisi kaydedildi.");
	}
	
	
	@GetMapping("/getByJsFirstNameAndJsLastName")
	public DataResult<JobSeekers> getByJsFirstNameAndJsLastName(String jsFirstName,String jsLastName){
		return new SuccessDataResult<JobSeekers>(this.jobseekersdao.getByJsFirstNameAndJsLastName(jsFirstName, jsLastName),"İş arayanın bilgileri kaydedili.");
	}
	
	@GetMapping("/getBySysEmail")
	public DataResult<SystemWorkers> getBySysEmail(String sysEmail){
		return new SuccessDataResult<SystemWorkers>(this.systemworkersdao.getBySysEmail(sysEmail),"Sistem çalışanının email bilgisi kaydedildi.");
	}
	@GetMapping("/getBySysFirstNameAndSysLastName")
	public DataResult<SystemWorkers> getBySysFirstNameAndSysLastName(String sysFirstName,String sysLastName){
		return new SuccessDataResult<SystemWorkers>(this.systemworkersdao.getBySysFirstNameAndSysLastName(sysFirstName, sysLastName),"Sistem çalışanlarının bilgileri kaydedildi.");
	}
	
	@GetMapping("/getByJobCityNameAndJobPositionName")
	public DataResult<JobAdversiment> getByJobCityNameAndJobPositionName(String jobCityName,String jobPositionName){
		return new SuccessDataResult<JobAdversiment>(this.jobadvdao.getByJobCityNameAndJobPositionName(jobCityName, jobPositionName),"İş için şehir ve pozisyon bilgileri tanımlandı ve kaydedildi.");
	}
	
	@GetMapping("/getByJobAdvOpeningDateAndJobAdvClosingDate")
	public DataResult<JobAdversiment> getByJobAdvOpeningDateAndJobAdvClosingDate(String jobAdvOpeningDate,String jobAdvClosingDate){
		return new SuccessDataResult<JobAdversiment>(this.jobadvdao.getByJobAdvOpeningDateAndJobAdvClosingDate(jobAdvOpeningDate, jobAdvClosingDate),"İş için tarih bilgileri sisteme tanımlandı.");
	}
	
}
