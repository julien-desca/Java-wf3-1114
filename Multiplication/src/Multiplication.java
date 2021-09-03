import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Veuillez entrer un nombre:");
		int number1 = scan.nextInt();
		System.out.println("Combien de multiple voulez vous calculer ?");
		int number2 = scan.nextInt();
		for (int i = 1 ; i <= number2 ; i++) {
			System.out.println(number1 + "X" + i + " = " + number1*i);
		}
	}

}
