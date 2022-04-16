package fr.eseo.pdlo.projet.artiste.modele.formes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CercleTest {

	@Test
	void test() {
		Cercle cercle = new Cercle();
		assertEquals(cercle.getLargeur(),Forme.LARGEUR_PAR_DEFAUT, "La largeur est : ");
		assertEquals(cercle.getHauteur(), Forme.HAUTEUR_PAR_DEFAUT, "La hauteur est : ");
	}

}
