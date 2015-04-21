package fr.soprasteria.util;

import java.util.Scanner;

/**
 * 
 * @author Brendan
 *
 *Classe utilitaire d'entr�es / sorties
 */

// Cr�ation d'une classe d'utilitaires comprenant des m�thodes qui serviront dans plusieurs autres classes !
	public class Util {
	private static Scanner sc= new Scanner(System.in);
	
	/**
	 * 
	 *Affiche l'information pass�e en param�tre
	 * @param texte
	 */
	public static void afficher(String texte){

		System.out.println(texte+"\n");
	}
	
	/**
	 * Permet de saisir un entier au clavier
	 * @return
	 */
	public static int lireInt(){
		int result=0;
		result = sc.nextInt();
		System.out.println();
		return result;
	}
	
	/**
	 * Permet de saisir une cha�ne au clavier
	 * @return
	 */
	public static String lireString(){
		String result=null;
		result = sc.nextLine();
		System.out.println();
		return result;
	}
	public static String getString(String prompt) {
	    System.out.print(prompt + " ");
	    return sc.nextLine();
	  }
	public static int getInt(String prompt) {
	    System.out.print(prompt + " ");
	    int entier = sc.nextInt();
	    sc.nextLine(); // Get rid of this line
	    // so that getString won't read it
	    return entier;
	  }
	
	public static void closeSc(){
		sc.nextLine();
	}
	
	public static void main(String[] args) {
		// fonction main vide
	}

}

