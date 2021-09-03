import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Article {

	private String denomination;
	
	private float prixHT;
	
	private float TVA;

	public Article(String denomination, float prixHT, float TVA) {
		this.denomination = denomination;
		this.prixHT = prixHT;
		this.TVA = TVA;
	}

	public String getDenomination() {
		return denomination;
	}

	public float getPrixHT() {
		return prixHT;
	}

	public float getTVA() {
		return TVA;
	}
	
	public float getPrixTTC() {
		return this.prixHT + (this.prixHT * this.TVA);
	}
	
	public String getDescriptionComplete() {
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		return this.denomination + ": " + this.prixHT + "€ HT / " + df.format(this.getPrixTTC()) + "€ TTC";
	}
	
}
