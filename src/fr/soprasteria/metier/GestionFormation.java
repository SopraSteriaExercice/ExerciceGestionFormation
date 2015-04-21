package fr.soprasteria.metier;

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
	
	
	//Méthode permettant de saisir les infos d'une formation
	public void saisieFormation(){};
	
	
	//Methode permettant de saisir une liste de stagiaires initiale pour une formation donnée
	public void saisieStagiaire(Formation f){
		String reponse="oui";
		int iter=1;
		while (reponse.equals("oui")){
			Stagiaire s=new Stagiaire();
			System.out.println("Quel est le Prénom du stagiaire numero "+iter+" ?");
			s.setPrenom(Util.lireString());
			System.out.println("Quel est son Nom ?");
			s.setNom(Util.lireString());
			System.out.println("Quel est son Age ?");
			s.setAge(Util.lireInt());
			ajouter(s,f);
			iter++;
			Util.afficher("Stagiaire inscrit ! Inscrire d'autres stagiaires ? (oui/non)");
			Util.lireString();
			reponse=Util.lireString();
		}
		Util.afficher("Inscriptions terminées ! ");
		
	}
}
