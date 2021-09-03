import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre:");
		int number = scan.nextInt();
		if(number % 2 == 0) {
			System.out.println(number + " est un chiffre pair");
		}
		else {
			System.out.println(number + " est un chiffre impair");
		}
	}

}
