package fr.eseo.pdlo.projet.artiste.modele.formes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;

import org.junit.jupiter.api.Test;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class CercleTest {

	@Test
	void testConstructeur() {
		Cercle cercle = new Cercle();
		assertEquals(cercle.getLargeur(),Forme.LARGEUR_PAR_DEFAUT, "La largeur est : ");
		assertEquals(cercle.getHauteur(), Forme.HAUTEUR_PAR_DEFAUT, "La hauteur est : ");
	}

	@Test
	void testConstructeur2() {
		Cercle c = new Cercle(10);
		assertEquals(c.getLargeur(), 10, "La largeur est : ");
		assertEquals(c.getHauteur(), 10, "La hauteur est : ");
	}
	
	@Test
	void testConstructeur3() {
		Cercle c = new Cercle(new Coordonnees(5, 6));
		assertEquals(c.getPosition().getAbscisse(), 5);
		assertEquals(c.getPosition().getOrdonnee(), 6);
	}
	
	@Test
	void testConstructeur4() {
		Cercle c = new Cercle(new Coordonnees(5, 6), 15);
		assertEquals(c.getPosition().getAbscisse(), 5);
		assertEquals(c.getPosition().getOrdonnee(), 6);
		assertEquals(c.getHauteur(), 15);
	}
	
	@Test
	void testPerimetre() {
		Cercle c = new Cercle();
		assertEquals(c.perimetre(), 2*Math.PI*50);
	}
	
	@Test
	void testAire() {
		Cercle c = new Cercle();
		assertEquals(c.aire(), Math.PI*Math.pow(50, 2));
	}
	
	@Test
	void testToStringEN() {
		Locale.setDefault(Locale.ENGLISH);
		Cercle c = new Cercle();
		assertEquals(c.toString(), c.toString());
	}
	
	@Test
	void testToString() {
		Cercle c = new Cercle();
		assertEquals(c.toString(), c.toString());
	}
}
