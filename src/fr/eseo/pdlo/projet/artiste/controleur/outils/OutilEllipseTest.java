package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class OutilEllipseTest {
	public void testConstructeurParDefaut() {
		JFrame fenetre = new JFrame("OutilEllipseTest");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(400, 240);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		
		PanneauDessin panneau = new PanneauDessin(400, 240, Color.white);
		OutilEllipse outilEllipse = new OutilEllipse();
		panneau.associerOutil(outilEllipse);
		
		fenetre.add(panneau);
		fenetre.setVisible(true);
	}
	
	
	// CONSTRUCTEUR //
	public OutilEllipseTest() {
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				OutilEllipseTest test = new OutilEllipseTest();
				test.testConstructeurParDefaut();
			}
		});
	}
}
