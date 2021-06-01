package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Component;

import kodlamaio.HRMS.Entities.concretes.Positions;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;

@Component
public interface JobPositionService {
	
	DataResult<List<Positions>> getAll();
	
	DataResult<Positions> getByPositionNameOrPositionId(String positionName,int positionId);

	

}
