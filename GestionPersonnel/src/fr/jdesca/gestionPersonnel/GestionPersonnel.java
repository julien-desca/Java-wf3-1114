package fr.jdesca.gestionPersonnel;

import fr.jdesca.gestionPersonnel.entite.Employe;
import fr.jdesca.gestionPersonnel.entite.FooFoo;

public class GestionPersonnel {

	public static void main(String[] args) {
		FooFoo foo = new FooFoo();
		Employe john = new Employe("John", "Doe", "Plombier", "2016", 8000, 151);
		Employe jane = new Employe("Jane", "Smith", "Maçon", "2000", 5000, 50);
		Employe georges = new Employe("Georges", "Dupond", "Glandeur", "2017", 1350, 15);
		Employe bebert = new Employe("Bebert", "Smith", "Livreur", "2012", 700, 151);
		Employe[] personnel = {john, jane, georges, bebert};
		for (Employe employe : personnel) {
			System.out.println(employe.getNomComplet() + " travaille comme " + employe.getPoste() + " et gagne " + employe.getSalaireHoraire() + " par heure");
		}
	}

}
