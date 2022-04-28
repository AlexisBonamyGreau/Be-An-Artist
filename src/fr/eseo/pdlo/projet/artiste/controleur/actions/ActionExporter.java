package fr.eseo.pdlo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionExporter extends AbstractAction {
	// CONSTANTE DE CLASSE //
	public static final String NOM_ACTION = "Exporter";
	
	
	// VARIABLE D'INSTANCE //
	private PanneauDessin panneauDessin;
	
	// CONSTRUCTEUR //
	public ActionExporter(PanneauDessin panneauDessin) {
		super(NOM_ACTION);
		this.panneauDessin = panneauDessin;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.panneauDessin.saveImage("export", "jpeg");
	}

}
