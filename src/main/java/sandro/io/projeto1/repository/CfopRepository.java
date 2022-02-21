package sandro.io.projeto1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import sandro.io.projeto1.entity.Cfop;


public interface CfopRepository extends JpaRepository<Cfop, String>  {
	
	Cfop findByCfopdescricao(String cfopdescricao);
	Cfop findByCfopnatureza(String cfopnatureza);
	
	@Query("select c from Cfop c where c.cfopdescricao like ?1%")
	Cfop findByCfopdescricaoLike(String cfopdescricao);
	

}

