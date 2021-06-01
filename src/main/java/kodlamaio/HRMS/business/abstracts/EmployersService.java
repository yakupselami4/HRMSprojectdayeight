package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Component;

import kodlamaio.HRMS.Entities.concretes.Employers;
import kodlamaio.HRMS.core.utilities.results.DataResult;


@Component
public interface EmployersService {
	DataResult<List<Employers>> getAll();
	//DataResult add(Employers employers);
	
	DataResult<Employers> getByCorpName(String corpName);
	
	DataResult<Employers> getByCorpWebsite(String corpWebsite);
	
	DataResult<Employers> getByCorpPhone(String corpPhone);
	

	


}
