package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Graphics2D;

import fr.eseo.pdlo.projet.artiste.modele.formes.Forme;

public abstract class VueForme {
	// VARIABLE D'INSTANCE //
	protected final Forme forme;
	
	// CONSTRUCTEUR //
	public VueForme(Forme forme) {
		this.forme = forme;
	}
	
	// ACCESSEUR //
	public Forme getForme() {
		return forme;
	}
	
	
	// AUTRE FONCTION //
	public abstract void affiche(Graphics2D g2d);
}
