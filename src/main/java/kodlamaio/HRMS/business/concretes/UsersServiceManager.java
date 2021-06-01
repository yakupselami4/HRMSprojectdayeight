package kodlamaio.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.HRMS.DataAccess.abstracts.UsersServiceDao;
import kodlamaio.HRMS.Entities.concretes.Users;
import kodlamaio.HRMS.business.abstracts.UsersService;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;


@Service
public class UsersServiceManager implements UsersService{
	private UsersServiceDao usersservicedao;
	
	@Autowired
	public UsersServiceManager(UsersServiceDao usersservicedao) {
		super();
		this.usersservicedao = usersservicedao;
	}
	
	

	@Override
	public List<Users> getAll() {
		
		return this.usersservicedao.findAll();
	}



	@Override
	public SuccessResult add(Users users) {
		return (SuccessResult) this.usersservicedao.findAll();
	}

}
