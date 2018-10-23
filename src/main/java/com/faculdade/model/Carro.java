package com.faculdade.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "carro")
public class Carro implements Serializable {
	
	private static final long serialVersionUID = 4342437800625200438L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false, length = 7)
	@NotBlank(message = "Placa é uma informação obrigatória.")
	private String placa;
	
	@Column(nullable = false, length = 30)
	@NotBlank(message = "Cor é uma informação obrigatória.")
	private String cor;
	
	@Column(nullable = false)
	@NotBlank(message = "O ano do modelo é uma informação obrigatória.")
	private int anoModelo;
	
	@Column(nullable = false, length = 50)
	@NotBlank(message = "Modelo é uma informação obrigatória.")
	private String modelo;
	
	@Column(nullable = false, length = 50)
	@NotBlank(message = "Marca é uma informação obrigatória.")
	private String marca;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}