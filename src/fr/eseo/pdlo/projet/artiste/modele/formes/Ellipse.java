package fr.eseo.pdlo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.Remplissable;
import fr.eseo.pdlo.projet.artiste.modele.Remplissage;

public class Ellipse extends Forme implements Remplissable {
	Remplissage remplissage;
	
	// CONSTRUCTEURS //
	public Ellipse() {
		super();
		setRemplissage(Remplissage.AUCUNE);
	}
	
	public Ellipse(double largeur, double hauteur) {
		super(largeur, hauteur);
		setRemplissage(Remplissage.AUCUNE);
	}
	
	public Ellipse(Coordonnees position) {
		super(position);
		setRemplissage(Remplissage.AUCUNE);
	}
	
	public Ellipse(Coordonnees position, double largeur, double hauteur) {
		super(position, largeur, hauteur);
		setRemplissage(Remplissage.AUCUNE);
	}
	
	
	// MUTATEURS //
	public void setLargeur(double largeur) {
		if (largeur < 0) {
			throw new IllegalArgumentException("Largeur négative");
		}
		else {
			super.setLargeur(largeur);
		}
	}
	
	public void setHauteur(double hauteur) {
		if (hauteur < 0) {
			throw new IllegalArgumentException("Hauteur négative");
		}
		else {
			super.setHauteur(hauteur);
		}
	}

	
	// AUTRES METHODES //
	public String toString() {
		String perimetre;
		String grandRayon;
		String petitRayon;
		String aire;
		
    	Locale locale  = Locale.getDefault();

    	DecimalFormat decimalFormat = (DecimalFormat)
    			NumberFormat.getNumberInstance(locale);
    	decimalFormat.applyPattern(Coordonnees.PATTERN);
    	
    	perimetre = decimalFormat.format(perimetre());
    	grandRayon = decimalFormat.format(Math.max(getHauteur()/2, getLargeur()/2));
    	petitRayon = decimalFormat.format(Math.min(getHauteur()/2, getLargeur()/2));
    	aire = decimalFormat.format(aire());
		
    	String chaine = "[Ellipse "+remplissage.getMode()+"] : pos "+getPosition().toString()
    			+" petit rayon "+petitRayon+" grand rayon "+grandRayon+" périmètre : "+perimetre+" aire : "+aire;
    	
    	if (locale == Locale.ENGLISH) {
    		chaine += " couleur = R"+getCouleur().getRed()+",G"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
    	}
    	else {
    		chaine += " couleur = R"+getCouleur().getRed()+",V"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
    	}
    	
		return chaine;
	}
	
	@Override
	public double aire() {
		return (Math.PI*getLargeur()/2*getHauteur()/2);
	}

	@Override
	public double perimetre() {
		double a = Math.min(getLargeur()/2, getHauteur()/2);
		double b = Math.max(getLargeur()/2, getHauteur()/2);
		double h = Math.pow((a-b)/(a+b),2);
		return (Math.PI * (a+b) * (1+(3*h)/(10+Math.sqrt(4-3*h))));
	}
	
	@Override
	public boolean contient(Coordonnees coordonnees) {
		double x = coordonnees.getAbscisse();
		double y = coordonnees.getOrdonnee();
		double h = getPosition().getAbscisse()+(getLargeur()/2);
		double k = getPosition().getOrdonnee()+(getHauteur()/2);
		double a = getLargeur()/2;
		double b = getHauteur()/2;
		
		boolean back = (Math.pow(x-h, 2)/Math.pow(a, 2)) + Math.pow(y-k, 2)/Math.pow(b, 2) < 1;
		return back;
	}

	@Override
	public Remplissage getRemplissage() {
		return this.remplissage;
	}

	@Override
	public void setRemplissage(Remplissage modeRemplissage) {
		this.remplissage = modeRemplissage;
	}
}
