package br.fepi.selecoes.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
public class Selecoes {	
	
	@JsonInclude(Include.NON_NULL)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JsonInclude(Include.NON_NULL)
	private String nome;
	
	@JsonInclude(Include.NON_NULL)
	private Integer numero_copas;
	
	@JsonInclude(Include.NON_NULL)
	private String cor_camisa_principal;
	
	@JsonInclude(Include.NON_NULL)
	private String cor_camisa_secundaria;
	
	@JsonInclude(Include.NON_NULL)
	private Boolean favorita;
	
	
	public Selecoes () {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getNumero_copas() {
		return numero_copas;
	}


	public void setNumero_copas(Integer numero_copas) {
		this.numero_copas = numero_copas;
	}


	public String getCor_camisa_principal() {
		return cor_camisa_principal;
	}


	public void setCor_camisa_principal(String cor_camisa_principal) {
		this.cor_camisa_principal = cor_camisa_principal;
	}


	public String getCor_camisa_secundaria() {
		return cor_camisa_secundaria;
	}


	public void setCor_camisa_secundaria(String cor_camisa_secundaria) {
		this.cor_camisa_secundaria = cor_camisa_secundaria;
	}


	public Boolean getFavorita() {
		return favorita;
	}


	public void setFavorita(Boolean favorita) {
		this.favorita = favorita;
	}
	
}