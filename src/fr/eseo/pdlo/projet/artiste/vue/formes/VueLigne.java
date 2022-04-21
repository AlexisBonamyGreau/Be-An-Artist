package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Color;
import java.awt.Graphics2D;

import fr.eseo.pdlo.projet.artiste.modele.formes.Ligne;

public class VueLigne extends VueForme {
	// VARIABLE DE CLASSE //
	Color couleurCourante;
	
	// CONSTRUCTEUR //
	public VueLigne(Ligne ligne) {
		super(ligne);
	}

	@Override
	public void affiche(Graphics2D g2d) {
		Ligne ligne = (Ligne) this.forme;
		g2d.setColor(ligne.getCouleur());
		g2d.drawLine((int) Math.round(ligne.getC1().getAbscisse()), (int) Math.round(ligne.getC1().getOrdonnee()),
                (int) Math.round(ligne.getC2().getAbscisse()),
                (int) Math.round(ligne.getC2().getOrdonnee()));
		this.couleurCourante = ligne.getCouleur();
	}
}
