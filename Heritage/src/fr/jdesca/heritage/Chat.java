package fr.jdesca.heritage;

public final class Chat extends Animal{

	private int nombreDeMoustache;
	
	public Chat(String nom, int age, float poids, int nombreDeMoustache) {
		super(nom, age, poids);
		this.nombreDeMoustache = nombreDeMoustache;
	}
	
	public int getNombreDeMoustache() {
		return this.nombreDeMoustache;
	}
	
	public String presenter() {
		return "Le chat s'appelle " + super.presenter() + "\n"
				+ "il possède " + this.nombreDeMoustache + " moustaches";
	}

	public void direBonjour() {
		// TODO Auto-generated method stub
		
	}


}
