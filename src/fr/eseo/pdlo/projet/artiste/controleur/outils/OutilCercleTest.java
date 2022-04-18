package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class OutilCercleTest {
	public void testConstructeurParDefaut() {
		JFrame fenetre = new JFrame("OutilCercleTest");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(400, 240);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		
		PanneauDessin panneau = new PanneauDessin(400, 240, Color.white);
		OutilCercle outilCercle = new OutilCercle();
		panneau.associerOutil(outilCercle);
		
		fenetre.add(panneau);
		fenetre.setVisible(true);
	}
	
	
	// CONSTRUCTEUR //
	public OutilCercleTest() {
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				OutilCercleTest test = new OutilCercleTest();
				test.testConstructeurParDefaut();
			}
		});
	}
}
