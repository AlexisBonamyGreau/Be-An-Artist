package fr.eseo.pdlo.projet.artiste.modele.formes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class EllipseTest {

	@Test
	void test() {
		Ellipse ellipse = new Ellipse();
		assertEquals(ellipse.getLargeur(),Forme.LARGEUR_PAR_DEFAUT, "La largeur est : ");
		assertEquals(ellipse.getHauteur(), Forme.HAUTEUR_PAR_DEFAUT, "La hauteur est : ");
	}

	@Test
	void testContientCoordonnees() {
		Ellipse ellipse = new Ellipse();
		Coordonnees coordonnees = new Coordonnees();
		
		assertTrue(ellipse.contient(coordonnees));
	}
}
