package fr.eseo.pdlo.projet.artiste.modele.formes;

import java.awt.Color;

import javax.swing.UIManager;

import fr.eseo.pdlo.projet.artiste.modele.Coloriable;
import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public abstract class Forme implements Coloriable {
	// CONSTANTES DE CLASSE //
	public static final double LARGEUR_PAR_DEFAUT = 100;
	public static final double HAUTEUR_PAR_DEFAUT = 100;
	public static final Color COULEUR_PAR_DEFAUT = UIManager.getColor("Panel.foreground");
	
	
	// VARIABLES D'INSTANCES //
	private double largeur;
	private double hauteur;
	private Coordonnees position;
	private Color couleurRemplissage;
	private Color couleurBordure;
	private boolean crenelage;
	
	
	// CONSTRUCTEURS //
	public Forme() {
		this(new Coordonnees(), LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}
	
	public Forme(double largeur, double hauteur) {
		this(new Coordonnees(), largeur, hauteur);
	}
	
	public Forme(Coordonnees position, double largeur, double hauteur) {
		setPosition(position);
		setLargeur(largeur);
		setHauteur(hauteur);
		setCouleur(COULEUR_PAR_DEFAUT);
		setCouleurBordure(COULEUR_PAR_DEFAUT);
	}
	
	public Forme(Coordonnees position) {
		this(position, LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT);
	}
	
	
	// ACCESSEURS //
	public Coordonnees getPosition() {
		return position;
	}
	
	public double getLargeur() {
		return largeur;
	}
	
	public double getHauteur() {
		return hauteur;
	}
	
	public Color getCouleurBordure() {
		return couleurBordure;
	}
	
	public boolean getCrenelage() {
		return crenelage;
	}
	
	public double getCadreMinX() {
		return Math.min(getPosition().getAbscisse(), getPosition().getAbscisse()+getLargeur());
	}
	
	public double getCadreMinY() {
		return Math.min(getPosition().getOrdonnee(), getPosition().getOrdonnee()+getHauteur());
	}
	
	public double getCadreMaxX() {
		return Math.max(getPosition().getAbscisse(), getPosition().getAbscisse()+getLargeur());
	}
	
	public double getCadreMaxY() {
		return Math.max(getPosition().getOrdonnee(), getPosition().getOrdonnee()+getHauteur());
	}
	
	
	// MUTATEURS //
	public void setPosition(Coordonnees position) {
		this.position = position;
	}
	
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}
	
	public void setCouleurBordure(Color couleurBordure) {
		this.couleurBordure = couleurBordure;
	}

	public void setCrenelage(boolean crenelage) {
		this.crenelage = crenelage;
	}
	
	
	// AUTRES METHODES //
	public void deplacerVers(double nouvX, double nouvY) {
		this.position.deplacerVers(nouvX, nouvY);
	}
	
	public void deplacerDe(double deltaX, double deltaY) {
		this.position.deplacerDe(deltaX, deltaY);
	}
	
	
	// METHODES D'INTERFACE //
	@Override
	public Color getCouleur() {
		return this.couleurRemplissage;
	}
	
	@Override
	public void setCouleur(Color couleur) {
		this.couleurRemplissage = couleur;
	}
	
	
	// METHODES ABSTRAITES //
	public abstract double aire();
	
	public abstract double perimetre();

	public abstract boolean contient(Coordonnees coordonnees);

}