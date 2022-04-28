package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;

public class OutilSupprimer extends Outil {
	// VARIABLE DE CLASSE //
		private VueForme formeSelectionnee;
		
		@Override
		public void mouseClicked(MouseEvent event) {
			boolean detect = false;
			for(VueForme vueForme : super.getPanneauDessin().getVueFormes()) {
				if (vueForme.getForme().contient(getDebut())) {
					formeSelectionnee = vueForme;
					detect = true;
				}
			}
			
			if (detect) {
				super.getPanneauDessin().retirerVueForme(formeSelectionnee);
				super.getPanneauDessin().repaint();
			}
		}
}
