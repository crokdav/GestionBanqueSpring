package fr.adaming.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Role {
@Id
@GeneratedValue
private long idRole;
@NotNull
private String role;

public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}



public long getIdRole() {
	return idRole;
}
public void setIdRole(long idRole) {
	this.idRole = idRole;
}
public Role(String role) {
	super();
	this.role = role;
}
public Role() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Role [idRole=" + idRole + ", role=" + role + "]";
}




}
