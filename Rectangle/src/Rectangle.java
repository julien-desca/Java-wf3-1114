import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez entrer une longueur");
		int longueur = scan.nextInt();
		System.out.println("Veuillez entrer une largeur");
		int largeur = scan.nextInt();
		int aire = longueur * largeur;
		System.out.println("Votre rectangle fait :" + aire + " de surface");
		int perimetre = (longueur + largeur) * 2;
		System.out.println("Votre rectangle fait: " + perimetre + " de perimetre");
	}

}
