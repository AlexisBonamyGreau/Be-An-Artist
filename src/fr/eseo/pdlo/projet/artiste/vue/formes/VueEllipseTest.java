package fr.eseo.pdlo.projet.artiste.vue.formes;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.formes.Ellipse;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class VueEllipseTest {
	private void testConstructeurParDefaut() {
		JFrame fenetre = new JFrame("VueEllipseTest");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(400, 240);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		
		PanneauDessin panneau = new PanneauDessin(400, 240, Color.white);
		
		Ellipse ellipse = new Ellipse(new Coordonnees(30, 21), 50, 100);
		ellipse.setCouleur(Color.MAGENTA);
		panneau.ajouterVueForme(new VueEllipse(ellipse));
		
		fenetre.add(panneau);
		fenetre.setVisible(true);
	}
	
	// CONSTRUCTEUR //
	public VueEllipseTest() {
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				VueEllipseTest test = new VueEllipseTest();
				test.testConstructeurParDefaut();
			}
		});
	}
}
