package fr.soprasteria.exec;

import fr.soprasteria.metier.Formation;
import fr.soprasteria.metier.GestionFormation;

public class Exec {

	public static void main(String[] args) {
		Formation f = GestionFormation.getInstance().saisieFormation();
		GestionFormation.getInstance().saisieStagiaire(f);
		GestionFormation.getInstance().moyenne(f);
		//new TestBufferedWriter("sauvegarde.txt");
		//Util.afficher(form.getNom()); //On verifie la bonne entree du nom de formation

		
		
		
	}

}
