import java.util.HashMap;
import java.util.Map;

public class ExempleMap {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Bière", "La boisson préférée des nordiste !");
		map.put("Vodka", "Pour allumer le barbcue");
		map.put("Rhum", "Pour faires des super cocktails");
		map.put("Champagne", "Pour les grande occasions");
		
		System.out.println(map.get("Bière"));
		System.out.println("==============================");
		
		System.out.println("Parcours de la map avec keySet()");
		for(String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		System.out.println("==============================");
		
		System.out.println("Parcours de la map avec entrySet()");
		for(Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		
		System.out.println("==============================");
		
		System.out.println(map.containsKey("Vodka"));
		System.out.println("==============================");
		
		map.remove("Vodka"); //supprime l'élément associé à la clé
		map.replace("Champagne", "parce qu'on aime les bulles");
		System.out.println("La map contient " + map.size() + " elements");

		System.out.println("==============================");
		System.out.println("Affichage des valeurs (sans les clé)");
		for(String s : map.values()) {
			System.out.println(s);
		}

		System.out.println("==============================");
		map.clear();
		System.out.println(map.isEmpty());
		
	}

}
