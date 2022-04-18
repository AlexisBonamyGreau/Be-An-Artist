package fr.eseo.pdlo.projet.artiste.vue.ihm;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionChoisirForme;
import fr.eseo.pdlo.projet.artiste.controleur.actions.ActionEffacer;

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
		JButton boutonEffacer = new JButton(new ActionEffacer(this.panneauDessin));
		boutonEffacer.setName(ActionEffacer.NOM_ACTION);
		this.add(boutonEffacer);
		
		
		ButtonGroup boutonChoixForme = new ButtonGroup();
		
		JToggleButton boutonLigne = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_LIGNE));
		boutonLigne.setName(ActionChoisirForme.NOM_ACTION_LIGNE);
		boutonChoixForme.add(boutonLigne);
		this.add(boutonLigne);
		
		JToggleButton boutonEllipse = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_ELLIPSE));
		boutonEllipse.setName(ActionChoisirForme.NOM_ACTION_ELLIPSE);
		boutonChoixForme.add(boutonEllipse);
		this.add(boutonEllipse);
		
		JToggleButton boutonCercle = new JToggleButton(new ActionChoisirForme(panneauDessin, this, ActionChoisirForme.NOM_ACTION_CERCLE));
		boutonCercle.setName(ActionChoisirForme.NOM_ACTION_CERCLE);
		boutonChoixForme.add(boutonCercle);
		this.add(boutonCercle);
	}
}
