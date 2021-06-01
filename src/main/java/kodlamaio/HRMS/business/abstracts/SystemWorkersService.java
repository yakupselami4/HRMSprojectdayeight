package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Component;

import kodlamaio.HRMS.Entities.concretes.SystemWorkers;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;


@Component
public interface SystemWorkersService {
	DataResult<List<SystemWorkers>> getAll();
	
	DataResult<SystemWorkers> getBySysEmail(String sysEmail);
	
	DataResult<SystemWorkers> getBySysFirstNameAndSysLastName(String sysFirstName,String sysLastName);

}
