package fr.eseo.pdlo.projet.artiste.modele.formes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.Remplissable;
import fr.eseo.pdlo.projet.artiste.modele.Remplissage;

public class Rectangle extends Forme implements Remplissable {
	Remplissage remplissage;
	
	// CONSTRUCTEURS //
	public Rectangle() {
		super();
		setRemplissage(Remplissage.AUCUNE);
	}
	
	public Rectangle(double largeur, double hauteur) {
		super(largeur, hauteur);
		setRemplissage(Remplissage.AUCUNE);
	}
	
	public Rectangle(Coordonnees position) {
		super(position);
		setRemplissage(Remplissage.AUCUNE);
	}
	
	public Rectangle(Coordonnees position, double largeur, double hauteur) {
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
		Locale locale = Locale.getDefault();
		
    	DecimalFormat decimalFormat = (DecimalFormat)
    			NumberFormat.getNumberInstance(locale);
    	decimalFormat.applyPattern(Coordonnees.PATTERN);
    	
    	String perimetre = decimalFormat.format(perimetre());
    	String aire = decimalFormat.format(aire());
    	String hauteur = decimalFormat.format(getHauteur());
    	String largeur = decimalFormat.format(getLargeur());
    	
    	String chaine = "[Rectangle "+remplissage.getMode()+"] : pos "+getPosition().toString()
    			+" largeur "+largeur+" hauteur "+hauteur+" périmètre : "+perimetre+" aire : "+aire;
		
    	if (locale == Locale.ENGLISH) {
    		chaine += " couleur = R"+getCouleur().getRed()+",G"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
    	}
    	else {
    		chaine += " couleur = R"+getCouleur().getRed()+",V"+getCouleur().getGreen()+",B"+getCouleur().getBlue();
    	}
    	
		return chaine;
	}
	
	

	@Override
	public Remplissage getRemplissage() {
		return this.remplissage;
	}

	@Override
	public void setRemplissage(Remplissage modeRemplissage) {
		this.remplissage = modeRemplissage;
	}

	@Override
	public double aire() {
		return getHauteur()*getLargeur();
	}

	@Override
	public double perimetre() {
		return getHauteur()*2 + getLargeur()*2;
	}

	@Override
	public boolean contient(Coordonnees coordonnees) {
		return (coordonnees.getAbscisse()<getPosition().getAbscisse() & coordonnees.getAbscisse()>getPosition().getAbscisse()
				& coordonnees.getOrdonnee()<getPosition().getOrdonnee() & coordonnees.getOrdonnee()>getPosition().getOrdonnee());
	}

}
