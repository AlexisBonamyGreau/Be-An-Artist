package fr.eseo.pdlo.projet.artiste.modele;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Coordonnees {
	// CONSTANTES DE CLASSE //
	public static final double ABSCISSE_PAR_DEFAUT = 0;
	public static final double ORDONNEE_PAR_DEFAUT = 0;
	public static final String PATTERN = "0.0#";
	
	// ATTRIBUTS //
	double abscisse;
	double ordonnee;
	
	
	// CONSTRUCTEURS //
	public Coordonnees() {
		this(ABSCISSE_PAR_DEFAUT, ORDONNEE_PAR_DEFAUT);
	}
	
	public Coordonnees(double abscisse, double ordonnee) {
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}
	
	
	// ACCESSEURS //
	public double getAbscisse() {
		return abscisse;
	}
	
	public double getOrdonnee() {
		return ordonnee;
	}
	
	
	// MUTATEURS //
	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse;
	}
	
	public void setOrdonnee(double ordonnee) {
		this.ordonnee = ordonnee;
	}
	
	
	// AUTRES METHODES //
	public void deplacerDe(double deltaX, double deltaY) {
		this.abscisse += deltaX;
		this.ordonnee += deltaY;
	}
	
	public void deplacerVers(double nouvelleAbscisse, double nouvelleOrdonnee) {
		this.abscisse = nouvelleAbscisse;
		this.ordonnee = nouvelleOrdonnee;
	}
	
    public double angleVers(Coordonnees coord){
        return Math.atan2(coord.ordonnee - this.ordonnee, coord.abscisse - this.abscisse);
    }
    
    public double distanceVers(Coordonnees coord){
        return Math.sqrt((coord.abscisse - this.abscisse)*(coord.abscisse - this.abscisse) + (coord.ordonnee - this.ordonnee)*(coord.ordonnee - this.ordonnee));
    }
    
    public String toString() {
    	String back = "";
    	
    	Locale locale  = Locale.getDefault();

    	DecimalFormat decimalFormat = (DecimalFormat)
    			NumberFormat.getNumberInstance(locale);
    	decimalFormat.applyPattern(PATTERN);
    	
    	back = ("("+ decimalFormat.format(getAbscisse())+" , "+decimalFormat.format(getOrdonnee())+")");
    	
		return back;
    }
}
