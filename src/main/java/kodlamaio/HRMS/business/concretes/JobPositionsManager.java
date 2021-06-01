package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.JobPositionsServiceDao;
import kodlamaio.HRMS.Entities.concretes.Positions;
import kodlamaio.HRMS.business.abstracts.JobPositionService;
import kodlamaio.HRMS.core.utilities.results.DataResult;
import kodlamaio.HRMS.core.utilities.results.SuccessDataResult;


@Service
public class JobPositionsManager implements JobPositionService{

		
	private JobPositionsServiceDao jobpositionservicedao;
	
	@Override
	public DataResult<List<Positions>> getAll() {
		return new SuccessDataResult<List<Positions>>(this.jobpositionservicedao.findAll());
	}

	@Override
	public DataResult<Positions> getByPositionNameOrPositionId(String positionName, int positionId) {

		return new SuccessDataResult<Positions>(this.jobpositionservicedao.getByPositionNameOrPositionId(positionName, positionId));
	}


	
	

}
