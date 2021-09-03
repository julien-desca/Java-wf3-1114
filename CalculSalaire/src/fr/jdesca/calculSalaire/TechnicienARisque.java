package fr.jdesca.calculSalaire;

public class TechnicienARisque extends Technicien implements EmployeARisque {

	public TechnicienARisque(String nom, String prenom, int age, String dateEntree, int unitesProduites) {
		super(nom, prenom, age, dateEntree, unitesProduites);
	}

	public int calculerSalaire() {
		return super.calculerSalaire() + PRIME_DE_RISQUE;
	}
	
}
