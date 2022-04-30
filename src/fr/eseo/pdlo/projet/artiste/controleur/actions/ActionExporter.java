package fr.eseo.pdlo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;

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
	    JFileChooser chooser = new JFileChooser(); 
	    chooser.setCurrentDirectory(new java.io.File("."));
	    chooser.setDialogTitle("choix");
	    chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	    chooser.setAcceptAllFileFilterUsed(false);
	    
	    if (chooser.showOpenDialog(panneauDessin) == JFileChooser.APPROVE_OPTION) { 
	    	this.panneauDessin.saveImage(chooser.getSelectedFile()+"/export", "jpeg");
	    }
	}

}
