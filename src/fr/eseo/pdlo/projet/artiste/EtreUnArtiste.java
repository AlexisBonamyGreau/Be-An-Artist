package fr.eseo.pdlo.projet.artiste;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import fr.eseo.pdlo.projet.artiste.controleur.outils.OutilLigne;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauBarreEtat;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauBarreOutils;
import fr.eseo.pdlo.projet.artiste.vue.ihm.PanneauDessin;

public class EtreUnArtiste {
	public void ConstructeurParDefaut() {
		JFrame fenetre = new JFrame("Etre Un Artiste");
		
		PanneauDessin panneau = new PanneauDessin();
		OutilLigne outilLigne = new OutilLigne();
		panneau.associerOutil(outilLigne);
		
		PanneauBarreOutils panneauOutils = new PanneauBarreOutils(panneau);
		fenetre.add(panneauOutils, BorderLayout.EAST);
		
		PanneauBarreEtat panneauEtat = new PanneauBarreEtat(panneau);
		fenetre.add(panneauEtat, BorderLayout.SOUTH);
		
		fenetre.add(panneau);
		
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setSize(PanneauDessin.LARGEUR_PAR_DEFAUT, PanneauDessin.HAUTEUR_PAR_DEFAUT);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}
	
	
	public void ConstructeurCustom(String titre, String str_largeur, String str_hauteur) {
		
		//int largeur = Integer.parseInt(str_largeur);
		//int hauteur = Integer.parseInt(str_hauteur);
		
		JFrame fenetre = new JFrame(titre);
		
		PanneauDessin panneau = new PanneauDessin();
		OutilLigne outilLigne = new OutilLigne();
		panneau.associerOutil(outilLigne);
		
		PanneauBarreOutils panneauOutils = new PanneauBarreOutils(panneau);
		fenetre.add(panneauOutils, BorderLayout.EAST);
		
		PanneauBarreEtat panneauEtat = new PanneauBarreEtat(panneau);
		fenetre.add(panneauEtat, BorderLayout.SOUTH);
		
		fenetre.add(panneau);
		
		int largeur = PanneauDessin.LARGEUR_PAR_DEFAUT;
		if (isANumber(str_largeur)) {
			largeur = Integer.parseInt(str_largeur);
		}
		
		int hauteur = PanneauDessin.HAUTEUR_PAR_DEFAUT;
		if (isANumber(str_hauteur)) {
			hauteur = Integer.parseInt(str_hauteur);
		}

		fenetre.setSize(largeur, hauteur);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setResizable(false);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
	}
	
	
	// CONSTRUCTEUR //
	public EtreUnArtiste() {
		
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				EtreUnArtiste main = new EtreUnArtiste();
				if (args.length != 3) {
					main.ConstructeurParDefaut();
				}
				else {
					main.ConstructeurCustom(args[0], args[1], args[2]);
				}
			}
		});
	}
	
	// AUTRE METHODE //
    private static boolean isANumber(String chaine){
        try{              
              Integer.parseInt(chaine);
              return true;
        }catch(NumberFormatException nfe){
              return false;
        }
   }
}
