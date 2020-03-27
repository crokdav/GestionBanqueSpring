package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Compte {
@Id
@GeneratedValue
private long idCompte;

@NotNull
private String numero;

private double solde;

@NotNull
@ManyToOne
private User utilisateur;

@NotNull
@ManyToOne
private User conseille;



public long getIdCompte() {
	return idCompte;
}

public void setIdCompte(long idCompte) {
	this.idCompte = idCompte;
}

public String getNumero() {
	return numero;
}

public void setNumero(String numero) {
	this.numero = numero;
}

public User getUtilisateur() {
	return utilisateur;
}

public void setUtilisateur(User utilisateur) {
	this.utilisateur = utilisateur;
}

public User getConseille() {
	return conseille;
}

public void setConseille(User conseille) {
	this.conseille = conseille;
}

public double getSolde() {
	return solde;
}

public void setSolde(double solde) {
	this.solde = solde;
}



public Compte(@NotNull String numero, double solde, @NotNull User utilisateur, @NotNull User conseille) {
	super();
	this.numero = numero;
	this.solde = solde;
	this.utilisateur = utilisateur;
	this.conseille = conseille;
}

public Compte() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Compte [idCompte=" + idCompte + ", numero=" + numero + ", solde=" + solde + ", utilisateur=" + utilisateur
			+ ", conseille=" + conseille + "]";
}      







}
