package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputListener;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public abstract class Outil implements MouseInputListener {
	// VARIABLES D'INSTANCES //
	private Coordonnees debut;
	private Coordonnees fin;
	private PanneauDessin panneauDessin;
	
	// ACCESSEURS //
	public Coordonnees getDebut() {
		return debut;
	}
	
	public Coordonnees getFin() {
		return fin;
	}
	
	public PanneauDessin getPanneauDessin() {
		return panneauDessin;
	}
	
	
	// MUTATEURS //
	public void setDebut(Coordonnees debut) {
		this.debut = debut;
	}
	
	public void setFin(Coordonnees fin) {
		this.fin = fin;
	}
	
	public void setPanneauDessin(PanneauDessin panneauDessin) {
		this.panneauDessin = panneauDessin;
	}
	
	
	// AUTRES METHODES //
	@Override
	public void mouseClicked(MouseEvent event) {
		
	}
	
	@Override
	public void mouseDragged(MouseEvent event) {
		
	}
	
	@Override
	public void mouseEntered(MouseEvent event) {
		
	}
	
	@Override
	public void mouseExited(MouseEvent event) {
		
	}
	
	@Override
	public void mouseMoved(MouseEvent event) {
		
	}
	
	@Override
	public void mousePressed(MouseEvent event) {
		setDebut(new Coordonnees(event.getX(), event.getY()));
	}
	
	@Override
	public void mouseReleased(MouseEvent event) {
		setFin(new Coordonnees(event.getX(), event.getY()));
	}
}
