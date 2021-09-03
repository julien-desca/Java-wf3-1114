
public class ExempleWrapper {
	public static void main(String[] args) {
		Integer i = 34;
		Float f = 45.5f;
		Character c = 'c';
		Boolean b = true;
		
		Integer ii = Integer.valueOf("42");
		System.out.println(ii * 2);
		
		System.out.println(i * ii);
	}
}
