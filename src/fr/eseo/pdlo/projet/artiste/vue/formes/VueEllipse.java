package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Graphics2D;

import fr.eseo.pdlo.projet.artiste.modele.formes.Ellipse;

public class VueEllipse extends VueForme {

	public VueEllipse(Ellipse ellipse) {
		super(ellipse);
	}

	@Override
	public void affiche(Graphics2D g2d) {
		Ellipse ellipse = (Ellipse) this.forme;
		g2d.drawOval((int) Math.round(ellipse.getPosition().getAbscisse()), (int) Math.round(ellipse.getPosition().getOrdonnee()),
				(int) Math.round(ellipse.getLargeur()), 
				(int) Math.round(ellipse.getHauteur()));
	}

}
