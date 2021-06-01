package kodlamaio.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.Employers;


public interface EmployersServiceDao extends JpaRepository<Employers,Integer>{
	
	Employers getByCorpName(String corpName);
	
	Employers getByCorpWebsite(String corpWebsite);
	
	Employers getByCorpPhone(String corpPhone);
}
