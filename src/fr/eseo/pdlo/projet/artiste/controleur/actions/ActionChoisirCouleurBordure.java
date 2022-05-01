package fr.eseo.pdlo.projet.artiste.controleur.actions;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JColorChooser;

import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionChoisirCouleurBordure extends AbstractAction {
	// CONSTANTE DE CLASSE //
	public static final String NOM_ACTION = "Couleur Bordure";
	
	
	// VARIABLE D'INSTANCE //
	private PanneauDessin panneauDessin;
	
	
	// CONSTRUCTEUR //
	public ActionChoisirCouleurBordure(PanneauDessin panneauDessin) {
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Color couleur = JColorChooser.showDialog(this.panneauDessin, NOM_ACTION, this.panneauDessin.getCouleurBordure());
		
		if (couleur != null) {
			this.panneauDessin.setCouleurBordure(couleur);
		}
	}

}
