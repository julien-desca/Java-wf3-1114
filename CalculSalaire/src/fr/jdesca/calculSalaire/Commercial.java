package fr.jdesca.calculSalaire;

public abstract class Commercial extends Employe {

	protected int chiffreAffaire;
	protected int prime;
	
	private final float POURCENTAGE = 0.2f;

	public Commercial(String nom, String prenom, int age, String dateEntree, int chiffreAffaire) {
		super(nom, prenom, age, dateEntree);
		this.chiffreAffaire = chiffreAffaire;
	}
	
	public int calculerSalaire() {
		return (int)((this.chiffreAffaire * POURCENTAGE) + this.prime);
	}
	
}
