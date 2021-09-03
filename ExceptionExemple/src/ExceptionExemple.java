import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExemple {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre:");
		try {
			int input = scan.nextInt();
			int i = 42/input;
			System.out.println("Resultat : " + i);
		}
		catch(ArithmeticException exception) {
			System.out.println("La divison par 0 est interdite !");
			System.out.println("Gros blaireau!");
			System.out.println("Le message d'erreur est le suivant :" + exception.getMessage());
		}
		catch (InputMismatchException e) {
			System.out.println("Vous devez rentrer un chiffre !");
			System.out.println("Gros blaireau!");
		}
		catch(Exception e) {
			System.out.println("Une exception inattendu s'est produite !");
			System.out.println(e.getMessage());
		}
		finally { //finally est un bloc optionnel
			System.out.println("Fin du programme");
		}
	}

}
