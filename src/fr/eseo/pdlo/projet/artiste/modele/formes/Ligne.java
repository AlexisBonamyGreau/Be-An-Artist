package fr.eseo.pdlo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class Ligne extends Forme {
	public static final double EPSILON = 0.2;
	
	// CONSTRUCTEURS //
	public Ligne(Coordonnees position, double largeur, double hauteur) {
		super(position, largeur, hauteur);
	}
	
	public Ligne() {
		this(new Coordonnees(), Forme.LARGEUR_PAR_DEFAUT, Forme.HAUTEUR_PAR_DEFAUT);
	}
	
	public Ligne(double largeur, double hauteur) {
		this(new Coordonnees(), largeur, hauteur);
	}
	
	public Ligne(Coordonnees position) {
		this(position, Forme.LARGEUR_PAR_DEFAUT, Forme.HAUTEUR_PAR_DEFAUT);
	}
	
	
	// ACCESSEURS //
	public Coordonnees getC1() {
		return getPosition();
	}
	
	public Coordonnees getC2() {
		Coordonnees back = new Coordonnees(getC1().getAbscisse(), getC1().getOrdonnee());
		back.setAbscisse(back.getAbscisse()+getLargeur());
		back.setOrdonnee(back.getOrdonnee()+getHauteur());
		return back;
	}
	
	
	// MUTATEURS //
	public void setC1(Coordonnees c1) {
		setLargeur(getC2().getAbscisse()-c1.getAbscisse());
		setHauteur(getC2().getOrdonnee()-c1.getOrdonnee());
		setPosition(c1);
	}
	
	public void setC2(Coordonnees c2) {
		setLargeur(c2.getAbscisse()-getC1().getAbscisse());
		setHauteur(c2.getOrdonnee()-getC1().getOrdonnee());
	}

	
	// AUTRES METHODES //
	public String toString() {
		String perimetre;
		String angle;
		
    	Locale locale  = Locale.getDefault();

    	DecimalFormat decimalFormat = (DecimalFormat)
    			NumberFormat.getNumberInstance(locale);
    	decimalFormat.applyPattern(Coordonnees.PATTERN);
    	
    	perimetre = decimalFormat.format(perimetre());
    	angle = decimalFormat.format(getAngle());
    	
    	String chaine = "[Ligne] c1 : "+getC1().toString()+" c2 : "+getC2().toString()+" longueur : "+perimetre+" angle : "+angle+"°";
    	
    	if (Locale.getDefault() == Locale.ENGLISH) {
    		chaine += " couleur = R"+getCouleur().getRed()+",G"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
    	}
    	else {
    		chaine += " couleur = R"+getCouleur().getRed()+",V"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
    	}
		
		return chaine;
	}
	
	public double aire() {
		return 0;
	}
	
	public double perimetre() {
		return (Math.sqrt(getLargeur()*getLargeur() + getHauteur()*getHauteur()));
	}
	
	public double getAngle() {
		if (Math.toDegrees(getC1().angleVers(getC2()))<0) return 360+Math.toDegrees(getC1().angleVers(getC2()));
		else return Math.toDegrees(getC1().angleVers(getC2()));
	}
	
	public boolean contient(Coordonnees coordonnees) {
		boolean back = (getC1().distanceVers(coordonnees)+getC2().distanceVers(coordonnees))-getC1().distanceVers(getC2())<=EPSILON;
		return back;
	}
}
