package fr.eseo.pdlo.projet.artiste.vue.ihm;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class PanneauDessinTest {
	
	// METHODES PRIVEES //
	private void testConstructeurParDefaut() {
		JFrame fenetre = new JFrame("Etre un Artiste");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(PanneauDessin.LARGEUR_PAR_DEFAUT, PanneauDessin.HAUTEUR_PAR_DEFAUT);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		
		PanneauDessin panneau = new PanneauDessin();
		fenetre.add(panneau);
		
		fenetre.setVisible(true);
	}
	
	private void testConstructeur() {
		JFrame fenetre = new JFrame("Blues du Businessman");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(400, 240);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		
		PanneauDessin panneau = new PanneauDessin(400, 240, Color.cyan);
		fenetre.add(panneau);
		
		fenetre.setVisible(true);
	}
	
	
	// CONSTRUCTEUR //
	public PanneauDessinTest() {
		testConstructeurParDefaut();
		testConstructeur();
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new PanneauDessinTest();
			}
		});
	}
}
