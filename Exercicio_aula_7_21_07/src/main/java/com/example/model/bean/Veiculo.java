package com.example.model.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_veiculo")
public class Veiculo {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column (nullable = false, length = 50)
	String marca;
	@Column (nullable = false, length = 50)
	String modelo;
	@Column (nullable = false, length = 10)
	String Ano;
	
	
	@ManyToOne
	private Pessoa pessoa;
	
	@OneToOne
	@JoinColumn (name= "id_da_placa")
	private Placa placa;
	
	public Placa getPlaca() {
		return placa;
	}
	public void setPlaca(Placa placa) {
		this.placa = placa;
	}
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAno() {
		return Ano;
	}
	public void setAno(String ano) {
		Ano = ano;
	}
	


}


