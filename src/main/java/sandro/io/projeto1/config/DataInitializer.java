package sandro.io.projeto1.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import sandro.io.projeto1.entity.User;
import sandro.io.projeto1.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent>  {
	
	@Autowired
	UserRepository userRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		
		List<User> users = userRepository.findAll();
		
		if(users.isEmpty()) {
			
			createUser("sandro","email1");
			createUser("mario","mario2");
			createUser("maria","mjfghf");
			
		}
		
		//User user = userRepository.getById(1L);
		//User user = userRepository.findByName("mario");
		
		//User user = userRepository.findByNameLike("mario");
		User user = userRepository.findByNameIgnoreCase("MARIO");
		
		System.out.println(user.getName());
		
		//userRepository.deleteById(2L);
		
		//user.setName("Volverine");
		//userRepository.save(user);
		
		
	}
	
	public void createUser(String name, String email) {
		
		User user = new User(name, email);
		userRepository.save(user);
	}

}
