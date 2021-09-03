package fr.jdesca.heritage;

public class Serpent extends Animal {

	private boolean venimeux;
	private float longueur;
	
	public Serpent(String nom, int age, float poids, boolean venimeux, float longueur) {
		super(nom, age, poids);
		this.venimeux = venimeux;
		this.longueur = longueur;
	}
	
	public String presenter() {
		String presentation = "Le serpent s'appelle" + super.presenter() + "\n";
		presentation = presentation + "Il mesure " + this.longueur + " cm\n";
		if(this.venimeux) {
			presentation = presentation + "Il est venimeux";
		}
		else {
			presentation = presentation + "Il n'est pas venimeux";
		}
		return presentation;
	}

	public void direBonjour() {
		// TODO Auto-generated method stub
		
	}

}
