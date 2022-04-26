package fr.eseo.pdlo.projet.artiste.modele.formes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Locale;

import org.junit.jupiter.api.Test;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;
import fr.eseo.pdlo.projet.artiste.modele.Remplissage;

public class EllipseTest {

	@Test
	void testConstructeurDefaut() {
		Ellipse ellipse = new Ellipse();
		assertEquals(ellipse.getLargeur(),Forme.LARGEUR_PAR_DEFAUT, "La largeur est : ");
		assertEquals(ellipse.getHauteur(), Forme.HAUTEUR_PAR_DEFAUT, "La hauteur est : ");
	}
	
	@Test
	void testConstructeurDimension() {
		Ellipse ellipse = new Ellipse(10, 10);
		assertEquals(ellipse.getLargeur(), 10, "La largeur est : ");
		assertEquals(ellipse.getHauteur(), 10, "La hauteur est : ");
	}
	
	@Test
	void testConstructeurPosition() {
		Coordonnees c = new Coordonnees(10, 10);
		Ellipse ellipse = new Ellipse(c, 50, 50);
		assertEquals(ellipse.getLargeur(), 50, "La largeur est : ");
		assertEquals(ellipse.getHauteur(), 50, "La hauteur est : ");
		assertEquals(ellipse.getPosition(), c);
	}
	
	@Test
	void testConstructeurParam() {
		Coordonnees c = new Coordonnees(10, 10);
		Ellipse ellipse = new Ellipse(c);
		assertEquals(ellipse.getLargeur(), 100, "La largeur est : ");
		assertEquals(ellipse.getHauteur(), 100, "La hauteur est : ");
		assertEquals(ellipse.getPosition(), c);
	}

	@Test
	void testSetLargeur1() {
		Ellipse e = new Ellipse();
		e.setLargeur(30);
		assertEquals(e.getLargeur(), 30);
	}
	
	@Test
	void testSetLargeur2(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Ellipse(new Coordonnees(7, 9), -6, 9);
		});
	}
	
	@Test
	void testSetHauteur1() {
		Ellipse e = new Ellipse();
		e.setHauteur(30);
		assertEquals(e.getHauteur(), 30);
	}
	
	@Test
	void testSetHauteur2(){
		assertThrows(IllegalArgumentException.class, () -> {
			new Ellipse(new Coordonnees(7, 9), 6, -9);
		});
	}
	
	@Test
	void testStringFR() {
		Locale.setDefault(Locale.FRENCH);
		Ellipse e = new Ellipse();
		assertEquals(e.toString(), e.toString());
	}
	
	@Test
	void testStringEN() {
		Locale.setDefault(Locale.ENGLISH);
		Ellipse e = new Ellipse();
		assertEquals(e.toString(), e.toString());
	}
	
	@Test 
	void testAire() {
		Ellipse e = new Ellipse();
		assertEquals(e.aire(), Math.PI*50*50);
	}
	
	@Test
	void testPerimetre() {
		Ellipse e = new Ellipse();
		assertEquals(e.perimetre(), Math.PI*50*(1/10+Math.sqrt(4)));
	}
	
	@Test
	void testContientCoordonnees() {
		Ellipse ellipse = new Ellipse();
		Coordonnees coordonnees = new Coordonnees(50, 50);
		
		assertTrue(ellipse.contient(coordonnees));
	}
	
	@Test
	void testRemplissage() {
		Ellipse e = new Ellipse();
		assertEquals(e.getRemplissage(), Remplissage.AUCUNE);
	}
	
	@Test
	void testContient() {
		Coordonnees c = new Coordonnees(50, 50);
		Ellipse e = new Ellipse();
		assertEquals(e.contient(c), true);
	}
	
	@Test
	void testContientNon() {
		Coordonnees c = new Coordonnees();
		Ellipse e = new Ellipse();
		assertEquals(e.contient(c), false);
	}
}
