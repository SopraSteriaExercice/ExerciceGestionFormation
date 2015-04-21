package fr.soprasteria.metier;

import java.util.ArrayList;
import java.util.Date;

public class Formation {
	protected String nom;
	protected Date date;
	ArrayList<Stagiaire> lstStagiaire=new ArrayList<Stagiaire>();// PAS BIEN, A MODIFIER PLUS TARD
	
	
	
	
	//ACCESSEURS
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public ArrayList<Stagiaire> getLstStagiaire() {
		return lstStagiaire;
	}
	public void setLstStagiaire(ArrayList<Stagiaire> lstStagiaire) {
		this.lstStagiaire = lstStagiaire;
	}

}
