package com.jessicaluana.apiJess.entities;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Destino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idDestino;
	private String nome;
	private String email;
	private String destino;
	private double valor;

	public Destino() {
	}

	public Destino(Integer idDestino, String nome, String email, String destino, double valor) {

		this.idDestino = idDestino;
		this.nome = nome;
		this.email = email;
		this.destino = destino;
		this.valor = valor;
	}

	public Integer getIdDestino() {
		return idDestino;
	}

	public void setIdDestino(Integer idDestino) {
		this.idDestino = idDestino;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(destino, email, idDestino, nome, valor);
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
		return Objects.equals(destino, other.destino) && Objects.equals(email, other.email)
				&& Objects.equals(idDestino, other.idDestino) && Objects.equals(nome, other.nome)
				&& Double.doubleToLongBits(valor) == Double.doubleToLongBits(other.valor);
	}

}
