package fr.jdesca.calculSalaire;

public class ManutentionnaireARisque extends Manutentionnaire implements EmployeARisque {

	public ManutentionnaireARisque(String nom, String prenom, int age, String dateEntree, int heuresTravaillees) {
		super(nom, prenom, age, dateEntree, heuresTravaillees);
	}
	
	public int calculerSalaire() {
		return super.calculerSalaire() + PRIME_DE_RISQUE;
	}

}
