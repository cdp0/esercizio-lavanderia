package com.esercizi.java.lavanderia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Lavanderie")
public class Lavanderia implements Serializable{

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="id_lavanderia")
	private Long idLavanderia;
	@Column (name="nome")
	private String nome;
	@Column (name="n_grucce")
	private int nGrucce;
	
	//costruttori
	public Lavanderia(Long idLavanderia, String nome, int nGrucce) {
		this.idLavanderia = idLavanderia;
		this.nome = nome;
		this.nGrucce = nGrucce;
	}
	public Lavanderia(String nome, int nGrucce) {
		this.nome = nome;
		this.nGrucce = nGrucce;
	}
	public Lavanderia() {
	}
	
	//getters e setters
	public Long getIdLavanderia() {
		return idLavanderia;
	}
	public void setIdLavanderia(Long idLavanderia) {
		this.idLavanderia = idLavanderia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getnGrucce() {
		return nGrucce;
	}
	public void setnGrucce(int nGrucce) {
		this.nGrucce = nGrucce;
	}
	
	//toString
	@Override
	public String toString() {
		return "Lavanderia [idLavanderia=" + idLavanderia + ", nome=" + nome + ", nGrucce=" + nGrucce + "]";
	}
	
}
