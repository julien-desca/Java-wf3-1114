package fr.jdesca.exempleString;

public class ExempleString {
	
	public static void main(String[] args) {
		String chaine = "Hello world";
		System.out.println(chaine.charAt(0));
		System.out.println(chaine.contains("world"));
		System.out.println(chaine.equals("Hello world"));
		System.out.println(chaine.equalsIgnoreCase("HELLO WORLD"));
		System.out.println(chaine.endsWith("rld"));
		System.out.println(chaine.startsWith("Hel"));
		System.out.println(chaine.indexOf('l'));
		System.out.println("".isEmpty());
		System.out.println(chaine.length());
		System.out.println(chaine.replace('l', 'Z')); //ATTENTION : ne modifie pas la chaine !
		String[] splitted = "salut hola hello".split(" ");
		for(String s : splitted) {
			System.out.println(s);
		}
		System.out.println(chaine.substring(2, 8));
		System.out.println(chaine.substring(2));
		System.out.println(chaine.toLowerCase());
		System.out.println(chaine.toUpperCase());
		System.out.println("    hello     ".trim());
		System.out.println(String.valueOf(32)); //créer une chaine de caractère "32"
	}
}
