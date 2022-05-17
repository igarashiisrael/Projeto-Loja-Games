package com.generation.gamestore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "db_produtos")
public class Produtos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank(message = "o atributo produto precisa ser preenchido")
	@Size(min = 5, max = 255, message = "o texto deve conter no minímo 5 caracteres "
	+ "e no maximo 255 caracteres")
	private String nome;

	@NotBlank(message = "o atributo produto precisa ser preenchido")
	@Size(min = 5, max = 255, message = "o texto deve conter no minímo 5 caracteres " 
	+ "e no maximo 255 caracteres")
	private String descricao;

	@NotBlank(message = "o atributo produto precisa ser preenchido")
	@Size(min = 5, max = 255, message = "o texto deve conter no minímo 5 caracteres " 
	+ "e no maximo 255 caracteres")
	private String console;

	@NotEmpty(message = "o valor de quantidade tem que ser preenchido")
	@Positive(message = "o número tem que ser positivo")
	private int quantidade;

	@NotEmpty(message = "o valor de quantidade tem que ser preenchido") //Não pode ser vazio
	@Positive(message = "o número tem que ser positivo")
	private double preco;

	@NotBlank(message = "o atributo produto precisa ser preenchido")
	@Size(min = 5, max = 1000, message = "o texto deve conter no minímo 5 caracteres " 
	+ "e no maximo 1000 caracteres")
	private String foto;
	
	@ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categoria categoria;

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}

}
