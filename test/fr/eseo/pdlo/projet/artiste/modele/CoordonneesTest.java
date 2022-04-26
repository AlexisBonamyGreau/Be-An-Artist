package fr.eseo.pdlo.projet.artiste.modele;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoordonneesTest {
	
	@Test
	public void testConstructeurDefaut() {
		Coordonnees c = new Coordonnees();
		
		assertEquals(c.getAbscisse(), Coordonnees.ABSCISSE_PAR_DEFAUT);
		assertEquals(c.getOrdonnee(), Coordonnees.ORDONNEE_PAR_DEFAUT);
	}
	
	@Test
	public void testConstructeur() {
		Coordonnees c = new Coordonnees(3.2, 6.5);
		
		assertEquals(c.getAbscisse(), 3.2);
		assertEquals(c.getOrdonnee(), 6.5);
	}
	
	@Test
	public void testSetAbscisse() {
		Coordonnees c = new Coordonnees();		
		assertEquals(c.getAbscisse(), 0);		
		c.setAbscisse(5.6);		
		assertEquals(c.getAbscisse(), 5.6);
	}
	
	@Test
	public void testSetOrdonnee() {
		Coordonnees c = new Coordonnees();		
		assertEquals(c.getOrdonnee(), 0);		
		c.setOrdonnee(5.6);
		assertEquals(c.getOrdonnee(), 5.6);
	}
	
	@Test
	public void testDeplacerDe() {
		Coordonnees c = new Coordonnees(1, 1);
		c.deplacerDe(10, 15);
		assertEquals(c.getAbscisse(), 11);
		assertEquals(c.getOrdonnee(), 16);
	}
	
	@Test
	public void testDeplacerVers() {
		Coordonnees c = new Coordonnees(1, 1);
		c.deplacerVers(10, 15);
		assertEquals(c.getAbscisse(), 10);
		assertEquals(c.getOrdonnee(), 15);
	}
	
	@Test
	public void testAngleVers() {
		Coordonnees c1 = new Coordonnees();
		Coordonnees c2 = new Coordonnees(100, 100);
		
		assertEquals(c1.angleVers(c2), Math.PI/4);	
	}
	
	@Test
	public void testDistanceVers() {
		Coordonnees c1 = new Coordonnees();
		Coordonnees c2 = new Coordonnees(1, 0);
		assertEquals(c1.distanceVers(c2), 1);
	}
}
