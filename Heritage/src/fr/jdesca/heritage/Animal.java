package fr.jdesca.heritage;

public abstract class Animal {

	protected String nom;
	private int age;
	private float poids;
	
	//final sert à déclarer une constante 
	//un variable qui ne peut être modifier
	final String CLASS_NAME = "Animal";
	
	public Animal(String nom, int age, float poids) {
		this.nom = nom;
		this.age = age;
		this.poids = poids;
	}
	
	/*
	 * toutes les classe qui hériterons de Animal
	 * devront OBLIGATOIREMENT avoir un méthode direBonjour()
	 */
	abstract public void direBonjour();

	public String getNom() {
		return nom;
	}

	public int getAge() {
		return age;
	}

	public float getPoids() {
		return poids;
	}
	
	public String presenter() {
		return this.getNom() + "\n"
				+ "il est agé de " + this.getAge() + " ans\n"
				+ "et il pèse " + this.getPoids() + "Kg";
	}
	
	
	
	
}
