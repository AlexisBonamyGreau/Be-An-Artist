package fr.eseo.pdlo.projet.artiste.modele.formes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import fr.eseo.pdlo.projet.artiste.modele.Coordonnees;

public class LigneTest {
	
	@Test
	void testSet() {
		Ligne l = new Ligne(100, 100);
		
		System.out.println(l.toString());
		
		l.setC1(new Coordonnees(0, 50));
		
		System.out.println(l.toString());
		
		System.out.println(l.getLargeur());
		System.out.println(l.getHauteur());
	}
	
	
	@Test
	void testAngle() {
		Ligne l = new Ligne(100, 100);
		
		assertEquals(l.getAngle(), 45);
	}

}
