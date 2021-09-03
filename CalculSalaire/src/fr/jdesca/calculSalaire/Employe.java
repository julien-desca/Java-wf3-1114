package fr.jdesca.calculSalaire;

public abstract class Employe {

	private String nom;
	private String prenom;
	private int age;
	private String dateEntree;
	
	public Employe(String nom, String prenom, int age, String dateEntree) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntree = dateEntree;
	}

	public abstract int calculerSalaire();
	
	public String getNomComplet() {
		return this.prenom + " " + this.nom;
	}
}
