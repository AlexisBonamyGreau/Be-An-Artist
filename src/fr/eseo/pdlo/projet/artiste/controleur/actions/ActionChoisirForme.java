package fr.eseo.pdlo.projet.artiste.controleur.actions;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import fr.eseo.pdlo.projet.artiste.controleur.outils.OutilEllipse;
import fr.eseo.pdlo.projet.artiste.controleur.outils.OutilLigne;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauBarreOutils;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class ActionChoisirForme extends AbstractAction {
	// CONSTANTES DE CLASSE //
	public static final String NOM_ACTION_LIGNE = "";
	public static final String NOM_ACTION_ELLIPSE = "";
	public static final String NOM_ACTION_CERCLE = "";
	
	
	// VARIABLES D'INSTANCE //
	@SuppressWarnings("unused")
	private PanneauBarreOutils panneauOutils;
	private PanneauDessin panneauDessin;
	private String nom = null;
	
	
	// CONSTRUCTEUR //
	public ActionChoisirForme(PanneauDessin panneauDessin, PanneauBarreOutils panneauOutils, String nom) {
		super(nom);
		this.panneauDessin = panneauDessin;
		this.panneauOutils = panneauOutils;
		this.nom = nom;
	}
	

	@Override
	public void actionPerformed(ActionEvent event) {
		System.out.println(event.getActionCommand());
		if (this.nom == NOM_ACTION_LIGNE) {
			panneauDessin.associerOutil(new OutilLigne());
		}
		
		if (this.nom == NOM_ACTION_ELLIPSE) {
			panneauDessin.associerOutil(new OutilEllipse());
		}
		
		if (this.nom == NOM_ACTION_CERCLE) {
			panneauDessin.associerOutil(new OutilEllipse());
		}
	}

}
