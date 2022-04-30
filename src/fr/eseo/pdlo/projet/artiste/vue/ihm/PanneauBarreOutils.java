package fr.eseo.pdlo.projet.artiste.vue.ihm;

import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionChoisirCouleur;
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
		this.add(boutonEffacer);
		
		JToggleButton boutonSupprimer = new JToggleButton(new ActionSupprimer(this.panneauDessin));
		boutonSupprimer.setMaximumSize(dimension);
		boutonSupprimer.setName(ActionSupprimer.NOM_ACTION);
		boutonChoixForme.add(boutonSupprimer);
		this.add(boutonSupprimer);
		
		JToggleButton boutonSelect = new JToggleButton(new ActionSelectionner(panneauDessin));
		boutonSelect.setMaximumSize(dimension);
		boutonSelect.setName(ActionSelectionner.NOM_ACTION);
		boutonChoixForme.add(boutonSelect);
		this.add(boutonSelect);
		
		JToggleButton boutonMove = new JToggleButton(new ActionDeplacer(panneauDessin));
		boutonMove.setMaximumSize(dimension);
		boutonMove.setName(ActionDeplacer.NOM_ACTION);
		boutonChoixForme.add(boutonMove);
		this.add(boutonMove);
		
		JButton boutonExport = new JButton(new ActionExporter(panneauDessin));
		boutonExport.setMaximumSize(dimension);
		boutonExport.setName(ActionExporter.NOM_ACTION);
		boutonChoixForme.add(boutonExport);
		this.add(boutonExport);
		
		
		
		// BOUTON DE FORMES //
		
		JLabel texteFormes = new JLabel("Forme :");
		texteFormes.setMaximumSize(dimension);
		this.add(texteFormes);
		
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
		
		JToggleButton boutonRectangle = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_RECTANGLE));
		boutonRectangle.setMaximumSize(dimension);
		boutonRectangle.setName(ActionChoisirForme.NOM_ACTION_RECTANGLE);
		boutonChoixForme.add(boutonRectangle);
		this.add(boutonRectangle);
		
		JToggleButton boutonCarre = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_CARRE));
		boutonCarre.setMaximumSize(dimension);
		boutonCarre.setName(ActionChoisirForme.NOM_ACTION_CARRE);
		boutonChoixForme.add(boutonCarre);
		this.add(boutonCarre);
		
		
		
		// BOUTONS DE REMPLISSAGE
		
		JLabel texteRemplissage = new JLabel("Remplissage :");
		texteRemplissage.setMaximumSize(dimension);
		this.add(texteRemplissage);
		
		JToggleButton boutonAucune = new JToggleButton(new ActionChoisirModeRemplissage(panneauDessin, Remplissage.AUCUNE));
		boutonAucune.setMaximumSize(dimension);
		boutonAucune.doClick();
		boutonChoixRemplissage.add(boutonAucune);
		this.add(boutonAucune);
		
		JToggleButton boutonUniforme = new JToggleButton(new ActionChoisirModeRemplissage(panneauDessin, Remplissage.UNIFORME));
		boutonUniforme.setMaximumSize(dimension);
		boutonChoixRemplissage.add(boutonUniforme);
		this.add(boutonUniforme);
		
		
		
		// BOUTON DE COULEUR //
		
		JLabel texteCouleur = new JLabel("Couleur :");
		texteCouleur.setMaximumSize(dimension);
		this.add(texteCouleur);
		
		JButton boutonCouleur = new JButton(new ActionChoisirCouleur(panneauDessin));
		boutonCouleur.setMaximumSize(dimension);
		boutonCouleur.setName(ActionChoisirCouleur.NOM_ACTION);
		boutonCouleur.setBackground(this.panneauDessin.getCouleurCourante());
		this.add(boutonCouleur);
	}
}
