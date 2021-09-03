
public class Pizza {
	
	private String nom;
	
	public static int count;
	
	public Pizza(String nom) {
		this.nom = nom;
		this.count ++;
	}
	
	public static void direCombienDePizzaOntEteInstancier() {
		System.out.println(Pizza.count + " pizzas ont été crées");
	}
	
}
