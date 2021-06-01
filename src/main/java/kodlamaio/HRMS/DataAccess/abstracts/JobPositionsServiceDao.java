package kodlamaio.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.Positions;

public interface JobPositionsServiceDao extends JpaRepository<Positions,Integer>{
	
	Positions getByPositionNameOrPositionId(String positionName,int positionId);

}
