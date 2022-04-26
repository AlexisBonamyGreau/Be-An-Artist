package fr.eseo.pdlo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class Carre extends Rectangle {
	// CONSTRUCTEURS //
	public Carre() {
		super(LARGEUR_PAR_DEFAUT, LARGEUR_PAR_DEFAUT);
	}
	
	public Carre(double taille) {
		super(taille, taille);
	}
	
	public Carre(Coordonnees position) {
		super(position);
	}
	
	public Carre(Coordonnees position, double taille) {
		super(position, taille, taille);
	}
	
	
	// MUTATEURS //
	public void setLargeur(double largeur) {
		super.setLargeur(largeur);
		super.setHauteur(largeur);
	}
	
	public void setHauteur(double hauteur) {
		super.setLargeur(hauteur);
		super.setHauteur(hauteur);
	}
	
	
	// AUTRES METHODES //
	public double perimetre() {
		return 4*getHauteur();
	}
	
	public double aire() {
		return Math.pow(getHauteur(), 2);
	}
	
	public String toString() {
		Locale locale = Locale.getDefault();
		
    	DecimalFormat decimalFormat = (DecimalFormat)
    			NumberFormat.getNumberInstance(locale);
    	decimalFormat.applyPattern(Coordonnees.PATTERN);
    	
    	String perimetre = decimalFormat.format(perimetre());
    	String taille = decimalFormat.format(getHauteur());
    	String aire = decimalFormat.format(aire());
    	
    	String chaine = "[Carre "+remplissage.getMode()+"] : pos "
    	    	+getPosition().toString()+" taille "+taille+" périmètre : "+perimetre+" aire : "+aire;
    	    	
    	if (locale == Locale.ENGLISH) {
    		chaine += " couleur = R"+getCouleur().getRed()
    				+",G"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
    	}
    	else {
    		chaine += " couleur = R"+getCouleur().getRed()
    				+",V"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
    	}
    	
    	return chaine;
	}
}
