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
	public void testAngleVers() {
		Coordonnees c1 = new Coordonnees();
		Coordonnees c2 = new Coordonnees(100, 100);
		
		assertEquals(c1.angleVers(c2), Math.PI/4);	
	}

}
