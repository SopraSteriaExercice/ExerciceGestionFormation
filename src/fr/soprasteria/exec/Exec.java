package fr.soprasteria.exec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import fr.soprasteria.metier.Formation;
import fr.soprasteria.metier.GestionFormation;
import fr.soprasteria.util.Util;

public class Exec {

	public static void main(String[] args) {
		Formation form = new Formation();
		form.setNom(Util.getString("Bonjour, quel est le nom de la formation pour laquelle vous allez inscrire des stagiaires ?"));
		Date date = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formater = null;
		formater = new SimpleDateFormat("'le' dd MMMM yyyy");
		Date aujourdhui = new Date();
		System.out.println("Nous sommes "+ formater.format(aujourdhui));
		String ddf = Util.getString("Veuillez entrer la date de debut de la formation (JJ/MM/AAAA) :\n");;
		
		String dff = Util.getString("Veuillez entrer la date de fin de la formation (JJ/MM/AAAA) :\n");
		
		
		try {
		
		date = simpleDateFormat.parse(ddf);
		
		System.out.println("Debut de la formation "+formater.format(date));
		
		date = simpleDateFormat.parse(dff);
		
		System.out.println("Fin de la formation "+formater.format(date));
		
		
		
		
		
		} catch (ParseException e) {
		
		e.printStackTrace();
		
		}
		//Util.afficher(form.getNom()); //On vérifie la bonne entrée du nom de formation
		GestionFormation.getInstance().saisieStagiaire(form);
		
		//YOUPITRALALA
		
	}

}
