package fr.eseo.pdlo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class Cercle extends Ellipse {
	// CONSTRUCTEURS //
	public Cercle() {
		super(LARGEUR_PAR_DEFAUT, LARGEUR_PAR_DEFAUT);
	}
	
	public Cercle(double taille) {
		super(taille, taille);
	}
	
	public Cercle(Coordonnees position) {
		super(position);
	}
	
	public Cercle(Coordonnees position, double taille) {
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
		return 2*Math.PI*getLargeur()/2;
	}
	
	public double aire() {
		return super.aire();
	}
	
	
	public String toString() {
		String perimetre;
		String rayon;
		String aire;
		
    	Locale locale  = Locale.getDefault();

    	DecimalFormat decimalFormat = (DecimalFormat)
    			NumberFormat.getNumberInstance(locale);
    	decimalFormat.applyPattern(Coordonnees.PATTERN);
    	
    	perimetre = decimalFormat.format(perimetre());
    	rayon = decimalFormat.format(getHauteur()/2);
    	aire = decimalFormat.format(aire());
		
    	String chaine = "[Cercle "+remplissage.getMode()+"] : pos "+getPosition().toString()+" rayon "+rayon+" périmètre : "+perimetre+" aire : "+aire;
    	
    	if (locale == Locale.ENGLISH) {
    		chaine += " couleur = R"+getCouleur().getRed()+",G"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
    	}
    	else {
    		chaine += " couleur = R"+getCouleur().getRed()+",V"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
    	}
    	
		return chaine;
	}
}
