package fr.eseo.pdlo.projet.artiste.vue.ihm;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.controleur.outils.OutilLigne;

public class PanneauBarreEtatTest {
	public void testConstructeurParDefaut() {
		JFrame fenetre = new JFrame("PanneauEtatTest");
		
		PanneauDessin panneau = new PanneauDessin();
		OutilLigne outilLigne = new OutilLigne();
		panneau.associerOutil(outilLigne);
		
		PanneauBarreEtat panneauEtat = new PanneauBarreEtat(panneau);
		
		panneau.add(panneauEtat);
		fenetre.add(panneau);
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(PanneauDessin.LARGEUR_PAR_DEFAUT, PanneauDessin.HAUTEUR_PAR_DEFAUT);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}


	// CONSTRUCTEUR //
	public PanneauBarreEtatTest() {
		
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				PanneauBarreEtatTest test = new PanneauBarreEtatTest();
				test.testConstructeurParDefaut();
			}
		});
	}
}
