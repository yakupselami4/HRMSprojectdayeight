package kodlamaio.HRMS.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Component;

import kodlamaio.HRMS.Entities.concretes.Users;
import kodlamaio.HRMS.core.utilities.results.SuccessResult;

@Component
public interface UsersService {
	List<Users> getAll();
	SuccessResult add(Users users);

}
