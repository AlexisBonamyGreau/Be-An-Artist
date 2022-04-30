package fr.eseo.pdlo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.pdlo.projet.artiste.controleur.outils.OutilDeplacer;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionDeplacer extends AbstractAction {
	// CONSTANTE DE CLASSE //
	public static final String NOM_ACTION = "Deplacer";
	
	// VARIABLE D'INSTANCE //
	public PanneauDessin panneauDessin = null;
	
	// CONSTRUCTEUR //
	public ActionDeplacer(PanneauDessin panneauDessin) {
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}
	
	@Override
	public void actionPerformed(ActionEvent event) {
		panneauDessin.associerOutil(new OutilDeplacer());
	}

}
