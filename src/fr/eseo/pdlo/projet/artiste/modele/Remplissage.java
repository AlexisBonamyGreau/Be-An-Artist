package fr.eseo.pdlo.projet.artiste.modele;

public enum Remplissage {
	AUCUNE("Aucun"), UNIFORME("Uniforme"), BICOLORE("Bicolore");
	
	private String mode;
	private Remplissage(String mode) {
		this.mode = mode;
	}
	
	public String getMode() {
		return this.mode;
	}
}
