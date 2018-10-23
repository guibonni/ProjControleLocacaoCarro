package com.faculdade.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "estado")
public class Estado implements Serializable {
	
	private static final long serialVersionUID = -2307200104095544074L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false, length = 2)
	@NotBlank(message = "UF é obrigatório.")
	private String uf;
	
	@Column(nullable = false, length = 50)
	@NotBlank(message = "Nome é obrigatório")
	private String nome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}