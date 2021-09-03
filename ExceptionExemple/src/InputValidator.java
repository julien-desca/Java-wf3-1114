
public class InputValidator {

	public void validateInput(String input) throws Exception{
		if(input.length() > 15) {
			throw new Exception("Votre nom doit faire moins de 16 caractère");
		}
	}
}
