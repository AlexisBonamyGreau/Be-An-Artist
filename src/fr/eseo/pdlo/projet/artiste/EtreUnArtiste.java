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
		ConstructeurCustom("Etre Un Artiste", String.valueOf(PanneauDessin.LARGEUR_PAR_DEFAUT), String.valueOf(PanneauDessin.HAUTEUR_PAR_DEFAUT));
	}
	
	
	public void ConstructeurCustom(String titre, String strLargeur, String strHauteur) {
		
		JFrame fenetre = new JFrame(titre);
		
		PanneauDessin panneauDessin = new PanneauDessin();
		OutilLigne outilLigne = new OutilLigne();
		panneauDessin.associerOutil(outilLigne);
		
		PanneauBarreOutils panneauBarreOutils = new PanneauBarreOutils(panneauDessin);
		fenetre.add(panneauBarreOutils, BorderLayout.EAST);
		
		PanneauBarreEtat panneauBarreEtat = new PanneauBarreEtat(panneauDessin);
		fenetre.add(panneauBarreEtat, BorderLayout.SOUTH);
		
		fenetre.add(panneauDessin);
		
		int largeur = PanneauDessin.LARGEUR_PAR_DEFAUT;
		if (isANumber(strLargeur)) {
			largeur = Integer.parseInt(strLargeur);
		}
		
		int hauteur = PanneauDessin.HAUTEUR_PAR_DEFAUT;
		if (isANumber(strHauteur)) {
			hauteur = Integer.parseInt(strHauteur);
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
