public class Store {

	public static void main(String[] args) {
		Article chaussette = new Article("chaussette rouge et noir", 35, 0.196f);
		Article claquette = new Article("claquette qui claque", 75, 0.196f);
		Article bob = new Article("Bob PMU", 45.56f, 0.12f);
		Article [] articles = {chaussette, claquette, bob};
		for (Article article : articles) {
			System.out.println(article.getDescriptionComplete());
		}
	}

}
