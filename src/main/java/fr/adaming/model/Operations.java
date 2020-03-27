package fr.adaming.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class Operations {
@Id
@GeneratedValue
private long idOperation;
@NotNull
private double montant;
@Temporal(TemporalType.DATE)
private Date date;

@NotNull
@OneToOne
private Compte emetteur;

@NotNull
@OneToOne
private Compte recepteur;



public double getMontant() {
	return montant;
}

public void setMontant(double montant) {
	this.montant = montant;
}

public Date getDate() {
	return date;
}

public void setDate(Date date) {
	this.date = date;
}

public Compte getEmetteur() {
	return emetteur;
}

public void setEmetteur(Compte emetteur) {
	this.emetteur = emetteur;
}

public Compte getRecepteur() {
	return recepteur;
}

public void setRecepteur(Compte recepteur) {
	this.recepteur = recepteur;
}

public Operations() {
	super();
	// TODO Auto-generated constructor stub
}


public long getIdOperation() {
	return idOperation;
}

public void setIdOperation(long idOperation) {
	this.idOperation = idOperation;
}

public Operations(@NotNull double montant, Date date, @NotNull Compte emetteur, @NotNull Compte recepteur) {
	super();
	this.montant = montant;
	this.date = date;
	this.emetteur = emetteur;
	this.recepteur = recepteur;
}

@Override
public String toString() {
	return "Operations [idOperation=" + idOperation + ", montant=" + montant + ", date=" + date + ", emetteur="
			+ emetteur + ", recepteur=" + recepteur + "]";
}





	
	
}
