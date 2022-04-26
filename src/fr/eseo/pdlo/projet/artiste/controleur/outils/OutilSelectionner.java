package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionSelectionner;
import fr.eseo.pdlo.projet.artiste.modele.formes.Forme;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;

public class OutilSelectionner extends Outil {
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
			JOptionPane.showConfirmDialog(super.getPanneauDessin(), (Object) formeSelectionnee.toString()
					, ActionSelectionner.NOM_ACTION, JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
