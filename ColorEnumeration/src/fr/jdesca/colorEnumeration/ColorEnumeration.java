package fr.jdesca.colorEnumeration;

import fr.jdesca.colorEnumeration.enumerations.Color;

public class ColorEnumeration {
	
	public static void main(String[] args) {
		Voiture vroom = new Voiture("Vroom Vroom 800", 5, 12, Color.NOIR);
		System.out.println("La couleur de la voiture a pour code :" + vroom.getColor().getHexCode());
		System.out.println("Les différentes couleur dispo sont :");
		for(Color color : Color.values()) {
			System.out.println(color + " (code hexa:" + color.getHexCode() + ")");
		}
	}
}
