import java.util.ArrayList;

public class ExempleList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(); //on précise le type d'élément de la liste entre <>
		list.add("Bière");
		list.add("Rhum");
		list.add("vodka");
		list.add("Vin");
		for (String alcool : list) {
			System.out.println(alcool);
		}
		System.out.println("=============================");
		list.add(2,"Champagne"); //ajoute champagne à l'indice 2 
		for (String alcool : list) {
			System.out.println(alcool);
		}
		
		list.remove(3);
		System.out.println("=============================");
		for (String alcool : list) {
			System.out.println(alcool);
		}

		System.out.println("=============================");
		list.set(2, "A boire !"); //remplace un element
		for (String alcool : list) {
			System.out.println(alcool);
		}

		System.out.println("=============================");
		System.out.println(list.get(0));
		
		System.out.println("=============================");
		list.clear();
		System.out.println(list.isEmpty());
		System.out.println(list.size());
	}

}

