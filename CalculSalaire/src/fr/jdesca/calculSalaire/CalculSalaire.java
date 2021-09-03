package fr.jdesca.calculSalaire;

public class CalculSalaire {
	
	public static void main(String[] args) {
		
		Personnel personnel = new Personnel();
		personnel.ajouterEmploye(new Vendeur("Dupont", "Robert", 47, "2010", 45000));
		personnel.ajouterEmploye(new Representant("Dupont", "Gaston", 54, "2010", 33000));
		personnel.ajouterEmploye(new Technicien("Doe", "John", 34, "2017", 500));
		personnel.ajouterEmploye(new Manutentionnaire("Smith", "Jane", 25, "2020", 150));
		personnel.ajouterEmploye(new ManutentionnaireARisque("Thomas", "Gregory", 45, "2013", 175));
		personnel.ajouterEmploye(new TechnicienARisque("Bradley", "Pittman", 36, "2019", 600));
		personnel.calculerSalaire();
		System.out.println("Le salaire moyen est de : " + personnel.salaireMoyen() + "€");
	}
	
}
