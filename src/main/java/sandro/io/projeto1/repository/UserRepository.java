package sandro.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sandro.io.projeto1.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	//https://docs.spring.io/spring-data/jpa/docs/2.5.9-SNAPSHOT/reference/html/#jpa.query-methods.query-creation
	
	User findByName(String name); //no spring data vc coloca findBy + nome da coluna
	User findByNameIgnoreCase(String name);
	
	@Query("select u from User u where u.name like ?1%")
	User findByNameLike(String name);

}
