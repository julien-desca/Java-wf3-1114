import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Veuillez entrer votre nom:");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("Salut " + input);
		System.out.println("Veuillez entrer votre age: ");
		int age = scan.nextInt();
		System.out.println("Vous avez : " + age + " ans");
	}

}
