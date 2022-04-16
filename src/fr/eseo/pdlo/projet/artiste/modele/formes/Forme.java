package fr.eseo.pdlo.projet.artiste.modele.formes;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public abstract class Forme {
	// CONSTANTES DE CLASSE //
	public static final double LARGEUR_PAR_DEFAUT = 100;
	public static final double HAUTEUR_PAR_DEFAUT = 100;
	
	
	// VARIABLES D'INSTANCES //
	private double largeur;
	private double hauteur;
	private Coordonnees position;
	
	
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
	
	
	// AUTRES METHODES //
	public void deplacerVers(double nouvX, double nouvY) {
		this.position.deplacerVers(nouvX, nouvY);
	}
	
	public void deplacerDe(double deltaX, double deltaY) {
		this.position.deplacerDe(deltaX, deltaY);
	}
	
	
	// METHODES ABSTRAITES //
	public abstract double aire();
	
	public abstract double perimetre();

	public abstract boolean contient(Coordonnees coordonnees);
}