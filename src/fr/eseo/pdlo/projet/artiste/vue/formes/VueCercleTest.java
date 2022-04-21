package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.formes.Cercle;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class VueCercleTest {
	private void testConstructeurParDefaut() {
		JFrame fenetre = new JFrame("VueCercleTest");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(400, 240);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		
		PanneauDessin panneau = new PanneauDessin(400, 240, Color.white);
		
		Cercle cercle = new Cercle(new Coordonnees(25, 100), 200);
		cercle.setCouleur(Color.GREEN);
		panneau.ajouterVueForme(new VueEllipse(cercle));
		
		fenetre.add(panneau);
		fenetre.setVisible(true);
	}
	
	
	// CONSTRUCTEUR //
	public VueCercleTest() {
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				VueCercleTest test = new VueCercleTest();
				test.testConstructeurParDefaut();
			}
		});
	}
}
