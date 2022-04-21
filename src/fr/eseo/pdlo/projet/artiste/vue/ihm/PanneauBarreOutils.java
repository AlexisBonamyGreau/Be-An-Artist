package fr.eseo.pdlo.projet.artiste.vue.ihm;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionChoisirCouleur;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionChoisirForme;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionEffacer;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionSelectionner;

public class PanneauBarreOutils extends JPanel {
	// VARIABLES D'INSTANCE //
	public PanneauDessin panneauDessin;
	
	
	// CONSTRUCTEUR //
	public PanneauBarreOutils(PanneauDessin panneauDessin) {
		this.panneauDessin = panneauDessin;
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		initComponents();
	}
	
	
	// AUTRE METHODE //
	private void initComponents() {
		Dimension dimension = new Dimension(200, 30);
		ButtonGroup boutonChoixForme = new ButtonGroup();
		
		JButton boutonEffacer = new JButton(new ActionEffacer(this.panneauDessin));
		boutonEffacer.setMaximumSize(dimension);
		boutonEffacer.setName(ActionEffacer.NOM_ACTION);
		this.add(boutonEffacer);
		
		
		
		JToggleButton boutonLigne = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_LIGNE));
		boutonLigne.setMaximumSize(dimension);
		boutonLigne.setName(ActionChoisirForme.NOM_ACTION_LIGNE);
		boutonChoixForme.add(boutonLigne);
		this.add(boutonLigne);
		
		JToggleButton boutonEllipse = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_ELLIPSE));
		boutonEllipse.setMaximumSize(dimension);
		boutonEllipse.setName(ActionChoisirForme.NOM_ACTION_ELLIPSE);
		boutonChoixForme.add(boutonEllipse);
		this.add(boutonEllipse);
		
		JToggleButton boutonCercle = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_CERCLE));
		boutonCercle.setMaximumSize(dimension);
		boutonCercle.setName(ActionChoisirForme.NOM_ACTION_CERCLE);
		boutonChoixForme.add(boutonCercle);
		this.add(boutonCercle);
		
		JToggleButton boutonSelect = new JToggleButton(new ActionSelectionner(panneauDessin));
		boutonSelect.setMaximumSize(dimension);
		boutonSelect.setName(ActionSelectionner.NOM_ACTION);
		boutonChoixForme.add(boutonSelect);
		this.add(boutonSelect);
		
		JToggleButton boutonCouleur = new JToggleButton(new ActionChoisirCouleur(panneauDessin));
		boutonCouleur.setMaximumSize(dimension);
		boutonCouleur.setName(ActionChoisirCouleur.NOM_ACTION);
		boutonCouleur.setBackground(this.panneauDessin.getCouleurCourante());
		this.add(boutonCouleur);
	}
}
