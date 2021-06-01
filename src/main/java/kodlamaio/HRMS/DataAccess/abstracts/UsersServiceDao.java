package kodlamaio.HRMS.DataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.HRMS.Entities.concretes.Users;


public interface UsersServiceDao extends JpaRepository<Users,Integer>{

}
