package fr.jdesca.colorEnumeration.enumerations;

public enum Color {
	ROUGE("#456578"),
	BLEU("#453456"),
	NOIR("#000000"),
	BLANC("#ffffff"),
	VERT("#5F4e66");
	
	private String hexcode;
	
	public String getHexCode() {
		return this.hexcode;
	}
	
	private Color(String hexcode) {
		this.hexcode = hexcode;
	}
}
