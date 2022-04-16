package fr.eseo.pdlo.projet.artiste.controleur.outils;

import fr.eseo.pdlo.projet.artiste.modele.formes.Ligne;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueForme;
import fr.eseo.pdlo.projet.artiste.vue.formes.VueLigne;

public class OutilLigne extends OutilForme {

	@Override
	protected VueForme creerVueForme() {
		Ligne ligne = new Ligne(getDebut());
		ligne.setC2(getFin());
		return  new VueLigne(ligne);
	}

}
