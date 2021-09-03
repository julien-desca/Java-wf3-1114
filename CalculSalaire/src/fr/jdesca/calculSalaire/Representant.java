package fr.jdesca.calculSalaire;

public class Representant extends Commercial {
	
	public Representant(String nom, String prenom, int age, String dateEntree, int chiffreAffaire) {
		super(nom, prenom, age, dateEntree, chiffreAffaire);
		this.prime = 120;
	}

}
