package com.wonderagencia.wonderturismoapi.entities;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Destino {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_destino;
	private String Nomedestino;
	private String Cidade;
	private String Estado;
	private String Descricao;
	
	@OneToMany(mappedBy= "id_pacote")
	private List <Pacote> pacote;
	

	public Destino() {}
	
	public Destino(Long id_destino, String nomedestino, String cidade, String estado, String descricao) {
		super();
		this.id_destino = id_destino;
		Nomedestino = nomedestino;
		Cidade = cidade;
		Estado = estado;
		Descricao = descricao;
		
		
	}

	public Long getId_destino() {
		return id_destino;
	}

	public void setId_destino(Long id_destino) {
		this.id_destino = id_destino;
	}

	public String getNomedestino() {
		return Nomedestino;
	}

	public void setNomedestino(String nomedestino) {
		Nomedestino = nomedestino;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id_destino);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Destino other = (Destino) obj;
		return Objects.equals(id_destino, other.id_destino);
	}
	
	public List<Pacote> getPacote() {
		return pacote;
	}

	public void setPacote(List<Pacote> pacote) {
		this.pacote = pacote;
	}
		
	
}
