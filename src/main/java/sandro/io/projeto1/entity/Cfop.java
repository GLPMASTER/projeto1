package sandro.io.projeto1.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cfop {
	
	@Id
	private String cfopnatureza;
	
	private String cfopdescricao;
	
	private Boolean ativo;

	public String getCfopnatureza() {
		return cfopnatureza;
	}

	public void setCfopnatureza(String cfopnatureza) {
		this.cfopnatureza = cfopnatureza;
	}

	public String getCfopdescricao() {
		return cfopdescricao;
	}

	public void setCfopdescricao(String cfopdescricao) {
		this.cfopdescricao = cfopdescricao;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	

}
