package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;

public class OutilDeplacer extends Outil {
	private VueForme formeSelectionnee;
	
	@Override
	public void mouseDragged(MouseEvent event) {
		for(VueForme vueForme : super.getPanneauDessin().getVueFormes()) {
			if (vueForme.getForme().contient(getDebut())) {
				formeSelectionnee = vueForme;
			}
		}
		
		setFin(new Coordonnees(event.getX()-formeSelectionnee.getForme().getLargeur()/2, event.getY()-formeSelectionnee.getForme().getHauteur()/2));
		super.getPanneauDessin().retirerVueForme(formeSelectionnee);
		formeSelectionnee.getForme().setPosition(getFin());
		super.getPanneauDessin().ajouterVueForme(formeSelectionnee);
		super.getPanneauDessin().repaint();
	}
}
