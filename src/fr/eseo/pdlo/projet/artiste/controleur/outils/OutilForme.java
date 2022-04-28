package fr.eseo.pdlo.projet.artiste.controleur.outils;

import java.awt.event.MouseEvent;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.formes.Forme;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;

public abstract class OutilForme extends Outil {
	// VARIABLE //
	private VueForme vueForme;
	
	// METHODES //
	@Override
	public void mouseClicked(MouseEvent event) {
        super.mouseClicked(event);
        setDebut(new Coordonnees(event.getX(), event.getY()));
        setFin(new Coordonnees(event.getX() + Forme.LARGEUR_PAR_DEFAUT, event.getY() + Forme.HAUTEUR_PAR_DEFAUT));
        
		if (event.getClickCount() == 2) {
			VueForme vueForme = creerVueForme();
			getPanneauDessin().ajouterVueForme(vueForme);
			getPanneauDessin().repaint();
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent event) {
		setFin(new Coordonnees(event.getX(), event.getY()));
		if (getDebut().getAbscisse() != getFin().getAbscisse() || getDebut().getOrdonnee() != getFin().getOrdonnee()) {
			getPanneauDessin().ajouterVueForme(creerVueForme());
			getPanneauDessin().repaint();
		}
	}
	
    @Override
    public void mousePressed(MouseEvent event)
    {
        super.mousePressed(event);
    }
    
    @Override
    public void mouseDragged(MouseEvent event)
    {
    	setFin(new Coordonnees(event.getX(), event.getY()));
    	getPanneauDessin().retirerVueForme(vueForme);;
    	this.vueForme = creerVueForme();
    	getPanneauDessin().ajouterVueForme(this.vueForme);
		getPanneauDessin().repaint();
    }
	
	
	// METHODE ABSTRAITE //
	protected abstract VueForme creerVueForme();
}
