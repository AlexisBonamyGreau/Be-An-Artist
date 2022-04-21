package fr.eseo.pdlo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class Ellipse extends Forme {
	// CONSTRUCTEURS //
	public Ellipse() {
		super();
	}
	
	public Ellipse(double largeur, double hauteur) {
		super(largeur, hauteur);
	}
	
	public Ellipse(Coordonnees position) {
		super(position);
	}
	
	public Ellipse(Coordonnees position, double largeur, double hauteur) {
		super(position, largeur, hauteur);
	}
	
	
	// MUTATEURS //
	public void setLargeur(double largeur) {
		super.setLargeur(largeur);
	}
	
	public void setHauteur(double hauteur) {
		super.setHauteur(hauteur);
	}

	
	// AUTRES METHODES //
	public String toString() {
		String perimetre;
		String grand_rayon;
		String petit_rayon;
		String aire;
		
    	Locale locale  = Locale.getDefault();

    	DecimalFormat decimalFormat = (DecimalFormat)
    			NumberFormat.getNumberInstance(locale);
    	decimalFormat.applyPattern(Coordonnees.PATTERN);
    	
    	perimetre = decimalFormat.format(perimetre());
    	grand_rayon = decimalFormat.format(Math.max(getHauteur(), getLargeur()));
    	petit_rayon = decimalFormat.format(Math.min(getHauteur(), getLargeur()));
    	aire = decimalFormat.format(aire());
		
    	String chaine = "[Ellipse] pos : "+getPosition().toString()+" petit rayon : "+petit_rayon+" grand rayon : "+grand_rayon+" périmètre : "+perimetre+" aire : "+aire;
    	
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
		return (Math.PI*getLargeur()*getHauteur());
	}

	@Override
	public double perimetre() {
		double a = Math.min(getLargeur(), getHauteur());
		double b = Math.max(getLargeur(), getHauteur());
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
}
