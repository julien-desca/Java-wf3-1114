package fr.jdesca.calculSalaire;

public class Vendeur extends Commercial {

	public Vendeur(String nom, String prenom, int age, String dateEntree, int chiffreAffaire) {
		super(nom, prenom, age, dateEntree, chiffreAffaire);
		this.prime = 60;
	}

}
