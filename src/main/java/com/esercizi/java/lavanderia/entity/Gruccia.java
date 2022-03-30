package com.esercizi.java.lavanderia.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="Grucce")
public class Gruccia implements Serializable {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column (name="id_gruccia")
	private Long idGruccia;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_lavanderia", referencedColumnName="id_lavanderia")
	private Long idLavanderia;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="id_vestito", referencedColumnName="id_vestito")
	@Column (name="id_vestito")
	private String idVestito;
	@Column (name="n_gruccia")
	private int nGruccia;
	@Column (name="libera")
	private boolean libera;
	
	//costruttori
	public Gruccia(Long idGruccia, Long idLavanderia, String idVestito, int nGruccia, boolean libera) {
		this.idGruccia = idGruccia;
		this.idLavanderia = idLavanderia;
		this.idVestito = idVestito;
		this.nGruccia = nGruccia;
		this.libera = libera;
	}
	public Gruccia(Long idLavanderia, String idVestito, int nGruccia, boolean libera) {
		this.idLavanderia = idLavanderia;
		this.idVestito = idVestito;
		this.nGruccia = nGruccia;
		this.libera = libera;
	}
	public Gruccia() {
	}
	
	//getters e setters
	public Long getIdGruccia() {
		return idGruccia;
	}
	public void setIdGruccia(Long idGruccia) {
		this.idGruccia = idGruccia;
	}
	public Long getIdLavanderia() {
		return idLavanderia;
	}
	public void setIdLavanderia(Long idLavanderia) {
		this.idLavanderia = idLavanderia;
	}
	public String getIdVestito() {
		return idVestito;
	}
	public void setIdVestito(String idVestito) {
		this.idVestito = idVestito;
	}
	public int getnGruccia() {
		return nGruccia;
	}
	public void setnGruccia(int nGruccia) {
		this.nGruccia = nGruccia;
	}
	public boolean isLibera() {
		return libera;
	}
	public void setLibera(boolean libera) {
		this.libera = libera;
	}
	
	//toString
	@Override
	public String toString() {
		return "Gruccia [idGruccia=" + idGruccia + ", idLavanderia=" + idLavanderia + ", idVestito=" + idVestito
				+ ", nGruccia=" + nGruccia + ", libera=" + libera + "]";
	}

}
