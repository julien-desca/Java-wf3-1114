
public class Chien {
	
	
	private String name;
	
	private int age;
	
	private float poids;
	
	public Chien(String name, int age, float poids) {
		this.name = name;
		this.age = age;
		this.poids = poids;
	}
	
	public Chien(String name, int age) {
		this.name = name;
		this.age = age;
		this.poids = 5;
	}
	
	public Chien() {
		this.name = "Chien par default";
		this.age = 0;
		this.poids = 5;
	}
	
	public void aboyer() {
		System.out.println("Ouaf");
	}
	
	public void aboyer(int fois) {
		for(int i = 0 ; i < fois ; i++) {
			aboyer();
		}
	}
	
	public String description() {
		return "Je m'appelle " + this.name +", je pèse " + this.poids + " et j'ai " + this.age + " ans";
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0) {
			age = 0;
		}
		this.age = age;
	}

	public float getPoids() {
		return poids;
	}

	public void setPoids(float poids) {
		this.poids = poids;
	}

}
