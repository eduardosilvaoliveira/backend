package com.wonderagencia.wonderturismoapi.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Pacote {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_pacote;
	private String Nomepacote;
	private Long Duracao;
	private String Preco;
	
	@ManyToOne
	@JoinColumn(name="id_destino")
	private Destino destino;
	
	
	public Destino getDestino() {
		return destino;
	}

	public void setDestino(Destino destino) {
		this.destino = destino;
	}

	public Pacote() {}

	public Pacote(Long id_pacote, String nomepacote, Long duracao, String preco) {
		super();
		this.id_pacote = id_pacote;
		Nomepacote = nomepacote;
		Duracao = duracao;
		Preco = preco;
	}

	public Long getId_pacote() {
		return id_pacote;
	}

	public void setId_pacote(Long id_pacote) {
		this.id_pacote = id_pacote;
	}

	public String getNomepacote() {
		return Nomepacote;
	}

	public void setNomepacote(String nomepacote) {
		Nomepacote = nomepacote;
	}

	public Long getDuracao() {
		return Duracao;
	}

	public void setDuracao(Long duracao) {
		Duracao = duracao;
	}

	public String getPreco() {
		return Preco;
	}

	public void setPreco(String preco) {
		Preco = preco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_pacote);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pacote other = (Pacote) obj;
		return Objects.equals(id_pacote, other.id_pacote);
	}
	
	
}
