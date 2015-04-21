package fr.soprasteria.exec;

import fr.soprasteria.metier.Formation;
import fr.soprasteria.util.Util;
import fr.soprasteria.metier.GestionFormation;

public class Exec {

	public static void main(String[] args) {
		Formation form=new Formation();
		Util.afficher("Bonjour, quel est le nom de la formation pour laquelle vous allez inscrire des stagiaires ?");
		form.setNom(Util.lireString());
		//Util.afficher(form.getNom()); //On vérifie la bonne entrée du nom de formation
		GestionFormation.getInstance().saisieStagiaire(form);
		
		//YOUPITRALALA
	}

}
