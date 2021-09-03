package fr.jdesca.gestionPersonnel.entite;

public class Employe {
	
	private String nom;
	private String prenom;
	private String poste;
	private String anneeEntree;
	private float salaireMensuel;
	private int heuresMensuelles;
	
	public Employe(String nom, 
			String prenom, 
			String poste, 
			String anneeEntree, 
			float salaireMensuel,
			int heuresMensuelles) {
		this.nom = nom;
		this.prenom = prenom;
		this.poste = poste;
		this.anneeEntree = anneeEntree;
		this.salaireMensuel = salaireMensuel;
		this.heuresMensuelles = heuresMensuelles;
	}
	
	public String getNomComplet() {
		return this.prenom + " " + this.nom;
	}
	
	public float getSalaireHoraire() {
		return this.salaireMensuel / this.heuresMensuelles;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getPoste() {
		return poste;
	}

	public String getAnneeEntree() {
		return anneeEntree;
	}

	public float getSalaireMensuel() {
		return salaireMensuel;
	}

	public int getHeuresMensuelles() {
		return heuresMensuelles;
	}
	
	
	

	//créer une classe principale GestionPersonnel (avec un méthode main)
	//instancier 2 ou 3 employé à l'interieur de celle ci & afficher leur nom complet et leur salaire horaire
	
}
