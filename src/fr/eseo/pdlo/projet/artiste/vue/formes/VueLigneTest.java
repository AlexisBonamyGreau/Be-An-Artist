package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.modele.formes.Ligne;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class VueLigneTest {
	private void testConstructeurParDefaut() {
		JFrame fenetre = new JFrame("VueLigneTest");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(400, 240);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		
		PanneauDessin panneau = new PanneauDessin(400, 240, Color.white);
		
		Ligne ligne = new Ligne();
		ligne.setCouleur(Color.ORANGE);
		panneau.ajouterVueForme(new VueLigne(ligne));
		
		fenetre.add(panneau);
		fenetre.setVisible(true);
	}
	
	
	// CONSTRUCTEUR //
	public VueLigneTest() {
		
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				VueLigneTest test = new VueLigneTest();
				test.testConstructeurParDefaut();
			}
		});
	}
}
