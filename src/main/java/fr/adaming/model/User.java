package fr.adaming.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;



@Entity
public class User {
@Id
@GeneratedValue
private long idUser;

private String nom;
private String prenom;

@NotNull
@Column(unique = true)
private String pseudo;
@NotNull
private String password;

@NotNull
@JoinColumn(name="idRole")
@ManyToOne
private Role role;

public long getIdUser() {
	return idUser;
}

public void setIdUser(long idUser) {
	this.idUser = idUser;
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

public String getPseudo() {
	return pseudo;
}

public void setPseudo(String pseudo) {
	this.pseudo = pseudo;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public Role getRole() {
	return role;
}

public void setRole(Role role) {
	this.role = role;
}

public User(String nom, String prenom, @NotNull String pseudo, @NotNull String password, @NotNull Role role) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.pseudo = pseudo;
	this.password = password;
	this.role = role;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}








}
