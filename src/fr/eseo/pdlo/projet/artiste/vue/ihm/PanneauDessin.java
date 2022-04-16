package fr.eseo.pdlo.projet.artiste.vue.ihm;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import fr.eseo.pdlo.projet.artiste.controleur.outils.Outil;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;

public class PanneauDessin extends JPanel {
	// VARIABLES D'INSTANCE //
	private final List<VueForme> vueFormes  = new ArrayList<VueForme>();
	private Outil outilCourant;
	
	// CONSTANTES DE CLASSE //
	public static final int LARGEUR_PAR_DEFAUT = 1080;
	public static final int HAUTEUR_PAR_DEFAUT = 720;
	public static final Color COULEUR_FOND_PAR_DEFAUT = Color.WHITE;
	
	// CONSTRUCTEURS //
	public PanneauDessin() {
		this(LARGEUR_PAR_DEFAUT, HAUTEUR_PAR_DEFAUT, COULEUR_FOND_PAR_DEFAUT);
	}
	
	public PanneauDessin(int largeur, int hauteur, Color fond) {
		super();
		this.setPreferredSize(new Dimension(largeur, hauteur));
		this.setBackground(fond);
	}
	
	
	// ACCESSEUR //
	public List<VueForme> getVueFormes() {
		return this.vueFormes;
	}
	
	public Outil getOutilCourant() {
		return outilCourant;
	}
	
	
	// AUTRES METHODES //
	public void ajouterVueForme(VueForme vueForme) {
		this.vueFormes.add(vueForme);
	}
	
	public void associerOutil(Outil outil) {
        if (outil != null)
        {
            dissocierOutil();
            setOutilCourant(outil);
            outil.setPanneauDessin(this);
            this.addMouseListener(outil);
            this.addMouseMotionListener(outil);
        }
	}
	
	public void dissocierOutil() {
        if (this.outilCourant != null)
        {
            this.removeMouseListener(this.outilCourant);
            this.removeMouseMotionListener(this.outilCourant);
            this.getOutilCourant().setPanneauDessin(null);
            this.outilCourant = null;
        }
	}
	
    private void setOutilCourant(Outil outilCourant) {
		this.outilCourant = outilCourant;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D)g.create();
        for (VueForme vueForme : this.vueFormes)
            vueForme.affiche(g2D);
		g2D.dispose();
	}
}
