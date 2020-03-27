package fr.adaming.model;

public class Login {
private String pseudo;
private String password;
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
public Login(String pseudo, String password) {
	super();
	this.pseudo = pseudo;
	this.password = password;
}
public Login() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Login [pseudo=" + pseudo + ", password=" + password + "]";
}

}
