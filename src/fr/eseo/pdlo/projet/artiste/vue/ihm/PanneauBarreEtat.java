package fr.eseo.pdlo.projet.artiste.vue.ihm;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class PanneauBarreEtat extends JPanel implements MouseMotionListener {
	// ATTRIBUTS //
	private JLabel valeurX;
	private JLabel valeurY;
	private PanneauDessin panneauDessin;
	
	// CONSTRUCTEUR //
	public PanneauBarreEtat(PanneauDessin panneauDessin) {
		this.panneauDessin = panneauDessin;
		
		this.valeurX = new JLabel("x: "+0);
		this.valeurY = new JLabel("y: "+0);
		
		this.add(getValeurX());
		this.add(getValeurY());
		
		this.panneauDessin.addMouseMotionListener(this);
		this.panneauDessin.setLayout(new FlowLayout());
	}

	// AUTRES METHODES //
	@Override
	public void mouseDragged(MouseEvent event) {
		mettreAJourAffichage(new Coordonnees(event.getX(), event.getY()));
	}

	@Override
	public void mouseMoved(MouseEvent event) {
		mettreAJourAffichage(new Coordonnees(event.getX(), event.getY()));
	}
	
	private void mettreAJourAffichage(Coordonnees coords) {
		getValeurX().setText("x: "+ coords.getAbscisse());
		getValeurY().setText("y: "+ coords.getOrdonnee());
	}

	
	// ACCESSEURS //
	public JLabel getValeurX() {
		return valeurX;
	}
	
	public JLabel getValeurY() {
		return valeurY;
	}

	
	// MUTATEURS //
	public void setValeurX(JLabel valeurX) {
		this.valeurX = valeurX;
	}

	public void setValeurY(JLabel valeurY) {
		this.valeurY = valeurY;
	}
}
