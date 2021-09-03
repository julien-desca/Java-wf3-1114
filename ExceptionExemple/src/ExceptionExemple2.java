import java.util.Scanner;

public class ExceptionExemple2 {

	public static void main(String[] args) {
		int i = 43/0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez entrer votre nom: ");
		String nom = scan.nextLine();
		InputValidator validator = new InputValidator();
		try {
			validator.validateInput(nom);
			System.out.println("Vous vous appelez : " + nom);
		}
		catch (Exception e) {
			System.out.println();
		}
	}

}
