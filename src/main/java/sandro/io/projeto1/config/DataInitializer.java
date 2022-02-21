package sandro.io.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sandro.io.projeto1.entity.Users;
import sandro.io.projeto1.repository.UserRepository;


@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>  {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		List<Users> users = userRepository.findAll();
		
		if(users.isEmpty()) {
			
			createUsers("sandro","email1");
			createUsers("mario","mario2");
			createUsers("maria","mjfghf");
			
		}
		
		//Users Users = UsersRepository.getById(1L);
		//Users Users = UsersRepository.findByName("mario");
		
		//Users Users = UsersRepository.findByNameLike("mario");
		Users u = userRepository.findByNameIgnoreCase("MARIO");
		
		System.out.println(u.getName());
		
		//UsersRepository.deleteById(2L);
		
		//Users.setName("Volverine");
		//UsersRepository.save(Users);
		
		
	}
	
	public void createUsers(String name, String email) {
		
		Users users = new Users(name, email);
		userRepository.save(users);
	}

}
