package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.eseo.pdlo.projet.artiste.modele.Remplissage;
import fr.eseo.pdlo.projet.artiste.modele.formes.Ellipse;

public class VueEllipse extends VueForme {
	// VARIABLE DE CLASSE //
	Color couleurRemplissage;
	Remplissage modeRemplissageCourant;

	public VueEllipse(Ellipse ellipse) {
		super(ellipse);
	}

	@Override
	public void affiche(Graphics2D g2d) {
		Ellipse ellipse = (Ellipse) this.forme;
		g2d.setColor(ellipse.getCouleur());
		
		if (ellipse.getRemplissage() == Remplissage.UNIFORME || ellipse.getRemplissage() == Remplissage.BICOLORE) {
			g2d.fillOval((int) Math.round(ellipse.getPosition().getAbscisse()), (int) Math.round(ellipse.getPosition().getOrdonnee()),
					(int) Math.round(ellipse.getLargeur()), 
					(int) Math.round(ellipse.getHauteur()));
		}
		
		if (ellipse.getRemplissage() == Remplissage.BICOLORE) {
			g2d.setColor(ellipse.getCouleurBordure());
		}
		
		g2d.drawOval((int) Math.round(ellipse.getPosition().getAbscisse()), (int) Math.round(ellipse.getPosition().getOrdonnee()),
				(int) Math.round(ellipse.getLargeur()), 
				(int) Math.round(ellipse.getHauteur()));
		
		this.couleurRemplissage = ellipse.getCouleur();
		this.modeRemplissageCourant = ellipse.getRemplissage();
	}

}
