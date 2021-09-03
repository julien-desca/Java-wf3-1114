package fr.jdesca.heritage;

public class Chien extends Animal {

	public Chien(String nom, int age, float poids) {
		super(nom, age, poids);
	}
	
	public String presenter() {
		return "Le chien s'appelle " + super.presenter();
	}
	
	public void aboyer() {
		System.out.println(this.nom + " dit: Ouaf Ouaf !");
	}

	public void direBonjour() {
		// TODO Auto-generated method stub
		
	}

}
