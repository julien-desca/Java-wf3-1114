package fr.jdesca.calculSalaire;

public class Technicien extends Employe {

	private int unitesProduites;
	private final int SALAIRE_PAR_UNITE = 5;
	
	
	public Technicien(String nom, String prenom, int age, String dateEntree, int unitesProduites) {
		super(nom, prenom, age, dateEntree);
		this.unitesProduites = unitesProduites;
	}


	public int calculerSalaire() {
		return this.unitesProduites * SALAIRE_PAR_UNITE;
	}

}
