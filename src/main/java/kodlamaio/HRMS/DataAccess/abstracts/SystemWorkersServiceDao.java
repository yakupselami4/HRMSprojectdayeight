package kodlamaio.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.SystemWorkers;


public interface SystemWorkersServiceDao extends JpaRepository<SystemWorkers,Integer>{
	
	SystemWorkers getBySysEmail(String sysEmail);
	
	SystemWorkers getBySysFirstNameAndSysLastName(String sysFirstName,String sysLastName);

}
