package fr.jdesca.colorEnumeration;

import fr.jdesca.colorEnumeration.enumerations.Color;

public class Voiture {
	
	private String nomModele;
	private int nombrePortes;
	private int chevaux;
	private Color color;
	
	public Voiture(String nomModele, int nombrePortes, int chevaux, Color color) {
		this.nomModele = nomModele;
		this.nombrePortes = nombrePortes;
		this.chevaux = chevaux;
		this.color = color;
	}
	
	public Color getColor() {
		return this.color;
	}
	
	
}
