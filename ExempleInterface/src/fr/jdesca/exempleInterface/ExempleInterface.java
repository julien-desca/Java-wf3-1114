package fr.jdesca.exempleInterface;

public class ExempleInterface {
	
	public static void main(String[] args) {
		Oiseau oiseau = new Oiseau();
		faitQuelqueChoseQuandOnDecolle(oiseau);
		faitQuelqueChoseAvecUnAnimal(oiseau);
	}
	
	public static void faitQuelqueChoseQuandOnDecolle(CanFly f) {
		System.out.println("l'objet decolle");
		f.decoller();
		f.voler();
	}
	
	public static void faitQuelqueChoseAvecUnAnimal(Animal a) {
		System.out.println("L'animal fait un truc");
	}
	
	public static void afficheObjetEnTantQueChaine(Object o) {
		System.out.println(o.toString());
	}
}
