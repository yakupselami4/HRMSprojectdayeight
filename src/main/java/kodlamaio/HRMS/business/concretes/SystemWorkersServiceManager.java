package kodlamaio.HRMS.business.concretes;

import java.util.List;


import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.SystemWorkersServiceDao;
import kodlamaio.HRMS.Entities.concretes.SystemWorkers;
import kodlamaio.HRMS.business.abstracts.SystemWorkersService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;
@Service
public class SystemWorkersServiceManager implements SystemWorkersService{
	
	private SystemWorkersServiceDao sysworkersdao;
	

	@Override
	public DataResult<SystemWorkers> getBySysEmail(String sysEmail) {
		return new SuccessDataResult<SystemWorkers>(this.sysworkersdao.getBySysEmail(sysEmail));
	}

	@Override
	public DataResult<SystemWorkers> getBySysFirstNameAndSysLastName(String sysFirstName,String sysLastName) {
		return new SuccessDataResult<SystemWorkers>(this.sysworkersdao.getBySysFirstNameAndSysLastName(sysFirstName,sysLastName));
	}

	@Override
	public DataResult<List<SystemWorkers>> getAll() {
		return new SuccessDataResult<List<SystemWorkers>>(this.sysworkersdao.findAll());
	}
	
	

}
