package fr.eseo.pdlo.projet.artiste.vue.ihm;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionChangerCouleur;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionChoisirCouleur;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionChoisirCouleurBordure;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionChoisirForme;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionChoisirModeRemplissage;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionDeplacer;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionEffacer;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionExporter;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionSelectionner;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionSupprimer;
import fr.eseo.pdlo.projet.artiste.modele.Remplissage;

public class PanneauBarreOutils extends JPanel {
	// VARIABLES D'INSTANCE //
	public PanneauDessin panneauDessin;
	
	
	// CONSTRUCTEUR //
	public PanneauBarreOutils(PanneauDessin panneauDessin) {
		this.panneauDessin = panneauDessin;
		this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		this.setBackground(Color.GRAY);
		initComponents();
	}
	
	
	// AUTRE METHODE //
	private void initComponents() {
		Dimension dimension = new Dimension(200, 30);
		ButtonGroup boutonChoixForme = new ButtonGroup();
		ButtonGroup boutonChoixRemplissage = new ButtonGroup();
		
		
		// BOUTONS D'ACTION //
		
		JLabel texteActions = new JLabel("Actions :");
		texteActions.setMaximumSize(dimension);
		this.add(texteActions);
		
		JButton boutonEffacer = new JButton(new ActionEffacer(this.panneauDessin));
		boutonEffacer.setMaximumSize(dimension);
		boutonEffacer.setName(ActionEffacer.NOM_ACTION);
		boutonEffacer.setBackground(Color.LIGHT_GRAY);
		this.add(boutonEffacer);
		
		JToggleButton boutonSupprimer = new JToggleButton(new ActionSupprimer(this.panneauDessin));
		drawButton(boutonSupprimer, ActionSupprimer.NOM_ACTION, boutonChoixForme);
		
		JToggleButton boutonSelect = new JToggleButton(new ActionSelectionner(panneauDessin));
		drawButton(boutonSelect, ActionSelectionner.NOM_ACTION, boutonChoixForme);
		
		JToggleButton boutonMove = new JToggleButton(new ActionDeplacer(panneauDessin));
		drawButton(boutonMove, ActionDeplacer.NOM_ACTION, boutonChoixForme);
		
		JButton boutonExport = new JButton(new ActionExporter(panneauDessin));
		boutonExport.setMaximumSize(dimension);
		boutonExport.setName(ActionExporter.NOM_ACTION);
		boutonExport.setBackground(Color.LIGHT_GRAY);
		boutonChoixForme.add(boutonExport);
		this.add(boutonExport);
		
		
		
		// BOUTON DE FORMES //
		
		JLabel texteFormes = new JLabel("Forme :");
		texteFormes.setMaximumSize(dimension);
		this.add(texteFormes);
		
		JToggleButton boutonLigne = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_LIGNE));
		drawButton(boutonLigne, ActionChoisirForme.NOM_ACTION_LIGNE, boutonChoixForme);
		
		JToggleButton boutonEllipse = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_ELLIPSE));
		drawButton(boutonEllipse, ActionChoisirForme.NOM_ACTION_ELLIPSE, boutonChoixForme);
		
		JToggleButton boutonCercle = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_CERCLE));
		drawButton(boutonCercle, ActionChoisirForme.NOM_ACTION_CERCLE, boutonChoixForme);
		
		JToggleButton boutonRectangle = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_RECTANGLE));
		drawButton(boutonRectangle, ActionChoisirForme.NOM_ACTION_RECTANGLE, boutonChoixForme);
		
		JToggleButton boutonCarre = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_CARRE));
		drawButton(boutonCarre, ActionChoisirForme.NOM_ACTION_CARRE, boutonChoixForme);
		
		
		
		// BOUTONS DE REMPLISSAGE
		
		JLabel texteRemplissage = new JLabel("Remplissage :");
		texteRemplissage.setMaximumSize(dimension);
		this.add(texteRemplissage);
		
		JToggleButton boutonAucune = new JToggleButton(new ActionChoisirModeRemplissage(panneauDessin, Remplissage.AUCUNE));
		drawButton(boutonAucune, null, boutonChoixRemplissage);
		boutonAucune.doClick();
		
		JToggleButton boutonUniforme = new JToggleButton(new ActionChoisirModeRemplissage(panneauDessin, Remplissage.UNIFORME));
		drawButton(boutonUniforme, null, boutonChoixRemplissage);
		
		
		
		// BOUTON DE COULEUR //
		
		JLabel texteCouleur = new JLabel("Couleur :");
		texteCouleur.setMaximumSize(dimension);
		this.add(texteCouleur);
		
		JButton boutonCouleur = new JButton(new ActionChoisirCouleur(panneauDessin));
		boutonCouleur.setMaximumSize(dimension);
		boutonCouleur.setName(ActionChoisirCouleur.NOM_ACTION);
		boutonCouleur.setBackground(Color.LIGHT_GRAY);
		this.add(boutonCouleur);
		
		JButton boutonCouleurBordure = new JButton(new ActionChoisirCouleurBordure(panneauDessin));
		boutonCouleurBordure.setMaximumSize(dimension);
		boutonCouleurBordure.setName(ActionChoisirCouleur.NOM_ACTION);
		boutonCouleurBordure.setBackground(Color.LIGHT_GRAY);
		this.add(boutonCouleurBordure);
		
		JToggleButton boutonChangeColor = new JToggleButton(new ActionChangerCouleur(panneauDessin));
		drawButton(boutonChangeColor, ActionChangerCouleur.NOM_ACTION, boutonChoixForme);
	}
	
	// AUTRE METHODE //
	private void drawButton(JToggleButton bouton, String nom, ButtonGroup groupe) {
		Dimension dimension = new Dimension(200, 30);
		bouton.setMaximumSize(dimension);
		bouton.setName(nom);
		bouton.setBackground(Color.LIGHT_GRAY);
		groupe.add(bouton);
		this.add(bouton);
	}
}
