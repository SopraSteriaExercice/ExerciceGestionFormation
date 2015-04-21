package fr.soprasteria.exec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		
		Date date = null;
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formater = null;
		Date aujourdhui = new Date();
		
		String date1 = "22/06/2006";
		
		String date2 = "22062006";
		
		formater = new SimpleDateFormat("'le' dd MMMM yyyy 'à' hh:mm:ss");
		System.out.println(formater.format(aujourdhui));
		
		try {
		
		date = simpleDateFormat.parse(date1);
		
		System.out.println(date);
		
		date = simpleDateFormat.parse(date2);
		
		System.out.println(date);
		
		} catch (ParseException e) {
		
		e.printStackTrace();
		
		}
		
	}

}
