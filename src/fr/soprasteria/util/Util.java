package fr.soprasteria.util;

import java.util.Scanner;

/**
 * 
 * @author Brendan
 *
 *Classe utilitaire d'entrées / sorties
 */

// Création d'une classe d'utilitaires comprenant des méthodes qui serviront dans plusieurs autres classes !
	public class Util {
	private static Scanner sc= new Scanner(System.in);
	
	/**
	 * 
	 *Affiche l'information passée en paramètre
	 * @param texte
	 */
	public static void afficher(String texte){

		System.out.println(texte);
	}
	
	/**
	 * Permet de saisir un entier au clavier
	 * @return
	 */
	public static int lireInt(){
		int result=0;
		result = sc.nextInt();
		return result;
	}
	
	/**
	 * Permet de saisir une chaîne au clavier
	 * @return
	 */
	public static String lireString(){
		String result=null;
		result = sc.nextLine();
		return result;
	}
	
	public static void closeSc(){
		sc.nextLine();
	}
	
	public static void main(String[] args) {
		// fonction main vide
	}

}

