package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.Color;
import java.awt.event.MouseEvent;

import javax.swing.JColorChooser;

import fr.eseo.pdlo.projet.artiste.modele.formes.Forme;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;

public class OutilChangerCouleur extends Outil {
	// VARIABLE DE CLASSE //
	private Forme formeSelectionnee;
	
	@Override
	public void mouseClicked(MouseEvent event) {
		boolean detect = false;
		for(VueForme vueForme : super.getPanneauDessin().getVueFormes()) {
			if (vueForme.getForme().contient(getDebut())) {
				formeSelectionnee = vueForme.getForme();
				detect = true;
			}
		}
		
		if (detect) {
			Color couleur = JColorChooser.showDialog(super.getPanneauDessin(), "Modifier couleur", super.getPanneauDessin().getCouleurCourante());
			if (couleur != null)
				formeSelectionnee.setCouleur(couleur);
			super.getPanneauDessin().repaint();
		}
	}
}
