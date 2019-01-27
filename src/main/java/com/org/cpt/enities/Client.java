package com.org.cpt.enities;

public class Client {

	private Long cin;
	private String nom;
	private String prenom;
	private String email;
	private String addresse;



	public Long getCin() {
		return cin;
	}

	public void setCin(Long cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	@Override
	public String toString() {
		return "Client [cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", addresse="
				+ addresse + "]";
	}

}
