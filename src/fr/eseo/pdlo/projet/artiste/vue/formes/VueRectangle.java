package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.eseo.pdlo.projet.artiste.modele.Remplissage;
import fr.eseo.pdlo.projet.artiste.modele.formes.Rectangle;

public class VueRectangle extends VueForme {
	// VARIABLES DE CLASSE //
	Color couleurCourante;
	Remplissage modeRemplissageCourant;
	

	public VueRectangle(Rectangle rectangle) {
		super(rectangle);
	}


	@Override
	public void affiche(Graphics2D g2d) {
		Rectangle rectangle = (Rectangle) this.forme;
		g2d.setColor(rectangle.getCouleur());
		
		if (rectangle.getRemplissage() == Remplissage.UNIFORME || rectangle.getRemplissage() == Remplissage.BICOLORE) {
			g2d.fillRect((int) Math.round(rectangle.getPosition().getAbscisse()), (int) Math.round(rectangle.getPosition().getOrdonnee())
					, (int) Math.round(rectangle.getLargeur())
					, (int) Math.round(rectangle.getHauteur()));
		}
		
		if (rectangle.getRemplissage() == Remplissage.AUCUNE || rectangle.getRemplissage() == Remplissage.BICOLORE) {
			g2d.setColor(rectangle.getCouleurBordure());
		}
		
		g2d.drawRect((int) Math.round(rectangle.getPosition().getAbscisse()), (int) Math.round(rectangle.getPosition().getOrdonnee())
					, (int) Math.round(rectangle.getLargeur())
					, (int) Math.round(rectangle.getHauteur()));
		
		this.couleurCourante = rectangle.getCouleur();
		this.modeRemplissageCourant = rectangle.getRemplissage();
	}
}
