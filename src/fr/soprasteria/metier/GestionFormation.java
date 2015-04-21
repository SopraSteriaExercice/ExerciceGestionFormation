package fr.soprasteria.metier;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.soprasteria.util.Util;

public class GestionFormation {
	//SINGLETON
	private static GestionFormation instance;
	
	//VERIFICATION DE L'UNICITE DE L'INSTANCE DE GestionFormation
	public static GestionFormation getInstance(){
		if (null == instance){ // Premier appel
			instance = new GestionFormation();
		}
		return instance;
	}
	
	// CONSTRUCTEUR PAR DEFAUT
	private GestionFormation(){
	}
	
	/**
	 * Ajoute une personne à la liste
	 * @param p la personne à ajouter
	 */
	public void ajouter(Stagiaire s, Formation f){
		f.lstStagiaire.add(s);
			
	}
	
	
	//Methode permettant de saisir les infos d'une formation
	public void saisieFormation(){};
	
	
	//Methode permettant de saisir une liste de stagiaires initiale pour une formation donnee
	public void saisieStagiaire(Formation f){
		String reponse="oui";
		int iter=1;
		while (reponse.equals("oui")){
			Stagiaire s=new Stagiaire();
			s.setPrenom(Util.getString("Quel est le Pr�nom du stagiaire numero "+iter+" ?"));
			s.setNom(Util.getString("Quel est son Nom ?"));
			s.setAge(Util.getInt("Quel est son age ?"));
			ajouter(s,f);
			iter++;
			reponse=Util.getString("Stagiaire inscrit ! Inscrire d'autres stagiaires ? (oui/non)");
		}
		Util.afficher("Inscriptions terminees ! ");
		
		
	}
}
