package fr.jdesca.calculSalaire;

public class Manutentionnaire extends Employe {

	private int heuresTravaillees;
	private final int SALAIRE_HORAIRE = 10;
	
	public Manutentionnaire(String nom, String prenom, int age, String dateEntree, int heuresTravaillees) {
		super(nom, prenom, age, dateEntree);
		this.heuresTravaillees = heuresTravaillees;
	}

	public int calculerSalaire() {
		return this.heuresTravaillees * SALAIRE_HORAIRE;
	}

}
