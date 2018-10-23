package com.faculdade.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotBlank;

@Entity(name = "funcionario")
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 2547984494668284632L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(nullable = false, length = 150)
	@NotBlank(message = "Nome é uma informação obrigatória.")
	private String nome;
	
	@Column(nullable = false, length = 12)
	@NotBlank(message = "Telefone é uma informação obrigatória.")
	private String telefone;
	
	@Column(nullable = false, length = 200)
	@NotBlank(message = "Endereço é uma informação obrigatória.")
	private String endereco;
	
	@Column(nullable = false, length = 100)
	@NotBlank(message = "Cidade é uma informação obrigatória.")
	private String cidade;
	
	@ManyToOne
	@Column(nullable = false, length = 2)
	@NotBlank(message = "Estado é uma informação obrigatória.")
	private Estado estado;
	
	@Column(nullable = true, length = 150)
	private String nomePai;
	
	@Column(nullable = true, length = 150)
	private String nomeMae;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

}