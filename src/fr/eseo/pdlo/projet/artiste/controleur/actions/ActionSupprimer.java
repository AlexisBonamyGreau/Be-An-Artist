package fr.eseo.pdlo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.pdlo.projet.artiste.controleur.outils.OutilSupprimer;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionSupprimer extends AbstractAction {
	// CONSTANTE DE CLASSE //
	public static final String NOM_ACTION = "Supprimer";
	
	// VARIABLE D'INSTANCE //
	public PanneauDessin panneauDessin = null;
	
	// CONSTRUCTEUR //
	public ActionSupprimer(PanneauDessin panneauDessin) {
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		panneauDessin.associerOutil(new OutilSupprimer());
	}

}
