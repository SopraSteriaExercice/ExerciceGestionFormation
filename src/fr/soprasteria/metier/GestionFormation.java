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
	private void ajouter(Stagiaire s, Formation f){
		f.lstStagiaire.add(s);
			
	}
	
	
	//Methode permettant de calculer la moyenne d'age des stagiaires d'une formation
	public void moyenne(Formation f){
		double moyenne =0;
		double somme=0;
		for (Stagiaire current : f.lstStagiaire){
			somme=somme+(double)(current.getAge());
		}
		moyenne=somme/(double)(f.lstStagiaire.size());
		System.out.println("La moyenne d'âge des stagiaires de la formation '"+f.getNom()+"' est de "+moyenne+" ans");
	}
	
	
	//Methode permettant de saisir les infos d'une formation
	public Formation saisieFormation(){
		Formation f = new Formation();
		f.setNom(Util.getString("Bonjour, quel est le nom de la formation pour laquelle vous allez inscrire des stagiaires ?"));
		Date date = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formater = null;
		formater = new SimpleDateFormat("dd MMMM yyyy");
		Date aujourdhui = new Date();
		System.out.println("Nous sommes le "+ formater.format(aujourdhui));
		String ddf = Util.getString("Veuillez entrer la date de debut de la formation (JJ/MM/AAAA) :\n");;
		
		String dff = Util.getString("Veuillez entrer la date de fin de la formation (JJ/MM/AAAA) :\n");
		
		
		try {
		
		date = simpleDateFormat.parse(ddf);
		
		System.out.println("Debut de la formation le "+formater.format(date));
		
		date = simpleDateFormat.parse(dff);
		
		System.out.println("Fin de la formation le "+formater.format(date));
		
		
		} catch (ParseException e) {
		
		e.printStackTrace();
		
		}
		Util.afficher("Ok, la formation '"+f.getNom()+"' qui débute le "+formater.format(date)+" a bien été enregistrée");
		Util.afficher("");
		return f;
	}
	
	
	//Methode permettant de saisir une liste de stagiaires initiale pour une formation donnee
	public void saisieStagiaire(Formation f){
		String reponse="oui";
		int iter=1;
		while (reponse.equals("oui")){
			Stagiaire s=new Stagiaire();
			s.setPrenom(Util.getString("Quel est le Prénom du stagiaire numero "+iter+" ?"));
			s.setNom(Util.getString("Quel est son Nom ?"));
			s.setAge(Util.getInt("Quel est son age ?"));
			ajouter(s,f);
			iter++;
			reponse=Util.getString("Stagiaire inscrit ! Inscrire d'autres stagiaires ? (oui/non)");
		}
		Util.afficher("Inscriptions terminées ! ");
		Util.afficher("");
		Util.afficher("Vous venez d'inscrire:");
		for (Stagiaire current : f.lstStagiaire){
			StringBuffer st = new StringBuffer();
			st.append(current.getPrenom());
			st.append(" ");
			st.append(current.getNom());
			st.append(", ");
			st.append(current.getAge());
			st.append(" ans");
			System.out.println(st);
		}
		
		
	}
}
