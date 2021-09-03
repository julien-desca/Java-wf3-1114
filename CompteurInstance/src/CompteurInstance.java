
public class CompteurInstance {
	
	public static void main(String[] arg) {
		Pizza pizza = new Pizza("Foo");
		Pizza.direCombienDePizzaOntEteInstancier();
		Pizza pizza2 = new Pizza("Bar");
		Pizza.direCombienDePizzaOntEteInstancier();
	}
}
