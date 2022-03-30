package com.esercizi.java.lavanderia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Vestiti")
public class Vestito implements Serializable{

	@Id
	@Column (name="id_vestito")
	private String idVestito;
	@Column (name="descrizione")
	private String descrizione;
	
	//costruttori
	public Vestito(String idVestito, String descrizione) {
		this.idVestito = idVestito;
		this.descrizione = descrizione;
	}
	public Vestito(String descrizione) {
		this.descrizione = descrizione;
	}
	public Vestito() {
	}
	
	//getters e setters
	public String getIdVestito() {
		return idVestito;
	}
	public void setIdVestito(String idVestito) {
		this.idVestito = idVestito;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	//toString
	@Override
	public String toString() {
		return "Vestito [idVestito=" + idVestito + ", descrizione=" + descrizione + "]";
	}
	
}
