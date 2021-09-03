package fr.jdesca.calculSalaire;

import java.util.ArrayList;
import java.util.List;

public class Personnel {

		private List<Employe> employes;

		public Personnel() {
			this.employes = new ArrayList<>();
		}
		
		public void ajouterEmploye(Employe e) {
			this.employes.add(e);
		}
		
		public void calculerSalaire() {
			for(Employe e : this.employes) {
				System.out.println(e.getNomComplet() + " gagne " + e.calculerSalaire());
			}
		}
		
		public float salaireMoyen() {
			float sommeSalaire = 0f;
			for(Employe e : this.employes) {
				sommeSalaire += e.calculerSalaire();
			}
			return sommeSalaire / this.employes.size();
		}
}
