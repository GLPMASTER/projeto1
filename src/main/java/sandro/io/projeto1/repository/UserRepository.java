package sandro.io.projeto1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sandro.io.projeto1.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
	
	//https://docs.spring.io/spring-data/jpa/docs/2.5.9-SNAPSHOT/reference/html/#jpa.query-methods.query-creation
	
	Users findByName(String name); //no spring data vc coloca findBy + nome da coluna
	Users findByNameIgnoreCase(String name);
	
	@Query("select u from Users u where u.name like ?1%")
	Users findByNameLike(String name);

}
