package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.formes.Cercle;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueCercle;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;

public class OutilCercle extends OutilForme {
	
	@Override
	protected VueForme creerVueForme() {
		double abscisse = 0;
		double ordonnee = 0;
		double diametre =  Math.max(Math.abs(getFin().getAbscisse() - getDebut().getAbscisse()), 
				Math.abs(getFin().getOrdonnee() - getDebut().getOrdonnee()));
		
		if (getFin().getAbscisse() > getDebut().getAbscisse())
			abscisse = getDebut().getAbscisse();
		else
			abscisse = getDebut().getAbscisse() - diametre;
		
		if (getFin().getOrdonnee() > getDebut().getOrdonnee())
			ordonnee = getDebut().getOrdonnee();
		else
			ordonnee = getDebut().getOrdonnee() - diametre;
		
		Cercle cercle = new Cercle(new Coordonnees(abscisse, ordonnee), diametre);
		cercle.setCouleur(super.getPanneauDessin().getCouleurRemplissage());
		cercle.setCouleurBordure(super.getPanneauDessin().getCouleurBordure());
		cercle.setRemplissage(super.getPanneauDessin().getModeRemplissageCourant());
		
		return new VueCercle(cercle);
	}
	
	
	public void mouseClicked(MouseEvent event) {
		super.mouseClicked(event);
	}

}
