package fr.jdesca.heritage;

public class Heritage {
	public static void main(String[] args) {
		Chien chien = new Chien("Rex", 2, 14.5f);
		Chat chat = new Chat("Minou", 5, 4, 12);
		Serpent serpent = new Serpent("snake", 5, 1.2f, false, 60);
		System.out.println(chien.presenter());
		System.out.println(chat.presenter());
		System.out.println(serpent.presenter());
		chien.aboyer();
	}
}
