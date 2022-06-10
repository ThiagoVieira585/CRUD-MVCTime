package com.ifce.br.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Time {
 
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String Nome;
	private String Titulos;
	private String AnoFundacao;
	private String Serie;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitulos() {
		return Titulos;
	}
	public void setTitulos(String titulos) {
		Titulos = titulos;
	}
	public String getAnoFundacao() {
		return AnoFundacao;
	}
	public void setAnoFundacao(String anoFundacao) {
		AnoFundacao = anoFundacao;
	}
	public String getSerie() {
		return Serie;
	}
	public void setSerie(String serie) {
		Serie = serie;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
 	
	
	
}
