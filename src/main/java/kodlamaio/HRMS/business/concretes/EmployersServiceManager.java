package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.EmployersServiceDao;
import kodlamaio.HRMS.Entities.concretes.Employers;
import kodlamaio.HRMS.business.abstracts.EmployersService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;


@Service
public class EmployersServiceManager implements EmployersService{

		
	private EmployersServiceDao employersservicedao;
	

	@Override
	public DataResult<Employers> getByCorpName(String corpName) {
		return new SuccessDataResult<Employers>(this.employersservicedao.getByCorpName(corpName));
	}

	@Override
	public DataResult<Employers> getByCorpWebsite(String corpWebsite) {
		return new SuccessDataResult<Employers>(this.employersservicedao.getByCorpWebsite(corpWebsite));
	}

	@Override
	public DataResult<Employers> getByCorpPhone(String corpPhone) {
		return new SuccessDataResult<Employers>(this.employersservicedao.getByCorpPhone(corpPhone));
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		return new SuccessDataResult<List<Employers>>(this.employersservicedao.findAll());
	}
	





}
