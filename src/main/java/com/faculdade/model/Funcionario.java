package com.faculdade.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	
	@Column(nullable = false, length = 2)
	@NotBlank(message = "Estado é uma informação obrigatória.")
	private String estado;
	
	@Column(nullable = true, length = 150)
	private String nomePai;
	
	@Column(nullable = true, length = 150)
	private String nomeMae;

}