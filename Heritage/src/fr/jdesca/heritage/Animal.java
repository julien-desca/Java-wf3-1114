package fr.jdesca.heritage;

public abstract class Animal {

	protected String nom;
	private int age;
	private float poids;
	
	//final sert � d�clarer une constante 
	//un variable qui ne peut �tre modifier
	final String CLASS_NAME = "Animal";
	
	public Animal(String nom, int age, float poids) {
		this.nom = nom;
		this.age = age;
		this.poids = poids;
	}
	
	/*
	 * toutes les classe qui h�riterons de Animal
	 * devront OBLIGATOIREMENT avoir un m�thode direBonjour()
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
				+ "il est ag� de " + this.getAge() + " ans\n"
				+ "et il p�se " + this.getPoids() + "Kg";
	}
	
	
	
	
}
