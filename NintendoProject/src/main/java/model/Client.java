package model;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	String nom;
	String prenom;
	private List<Achat> achat = new ArrayList();
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + "]";
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
	public List<Achat> getAchat() {
		return achat;
	}
	public void setAchat(List<Achat> achat) {
		this.achat = achat;
	}
	
	
	

}
