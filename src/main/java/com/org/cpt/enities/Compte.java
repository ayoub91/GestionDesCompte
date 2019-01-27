package com.org.cpt.enities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String numero;
	private double solde;
	private String libele;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Id_client")
	private Client client;

	public Compte(String numero, double solde, String libele, Client client) {
		super();
		this.numero = numero;
		this.solde = solde;
		this.libele = libele;
		this.client = client;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public String getLibele() {
		return libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + ", libele=" + libele + ", client=" + client + "]";
	}

}
