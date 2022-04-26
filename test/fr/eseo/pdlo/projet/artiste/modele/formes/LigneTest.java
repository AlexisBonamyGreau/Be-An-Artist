package fr.eseo.pdlo.projet.artiste.modele.formes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Locale;

import org.junit.jupiter.api.Test;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class LigneTest {
	
	@Test
	void testConstructeur1() {
		Ligne l = new Ligne();
		assertEquals(l.getLargeur(), 100);
		assertEquals(l.getHauteur(), 100);
	}
	
	@Test
	void testConstructeur2() {
		Ligne l = new Ligne(new Coordonnees(20, 30));
		assertEquals(l.getPosition().getAbscisse(), 20);
		assertEquals(l.getPosition().getOrdonnee(), 30);
	}
	
	@Test
	void testSetC2() {
		Ligne l = new Ligne();
		l.setC2(new Coordonnees(10, 0));
		assertEquals(l.getLargeur(), 10);
		assertEquals(l.getHauteur(), 0);
	}
	
	@Test
	void testSet() {
		Ligne l = new Ligne(100, 100);
		l.setC1(new Coordonnees(0, 50));
	}
	
	@Test
	void testToStringEN() {
		Locale.setDefault(Locale.ENGLISH);
		Ligne l = new Ligne();
		assertEquals(l.toString(), l.toString());
	}
	
	@Test
	void testToString() {
		Ligne l = new Ligne();
		assertEquals(l.toString(), l.toString());
	}
	
	@Test
	void testAire() {
		Ligne l = new Ligne();
		assertEquals(l.aire(), 0);
	}
	
	@Test
	void testAngle1() {
		Ligne l = new Ligne();
		assertEquals(l.getAngle(), 45);
	}
	
	@Test
	void testAngle2() {
		Ligne l = new Ligne(100, -100);
		assertEquals(l.getAngle(), 315);
	}
	
	@Test
	void testContient() {
		Ligne l = new Ligne();
		Coordonnees c = new Coordonnees(10, 10);
		assertTrue(l.contient(c));
	}
	
	@Test
	void testContientN() {
		Ligne l = new Ligne();
		Coordonnees c = new Coordonnees(0, 10);
		assertFalse(l.contient(c));
	}
}
