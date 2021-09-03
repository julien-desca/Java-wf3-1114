import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class DateEtHeure {
	public static void main(String[] args) {
		LocalDate aujourdhui = LocalDate.now();
		System.out.println("Nous somme le :");
		System.out.println(aujourdhui);
		
		LocalDate naissanceDuMeilleurFormateurDuMonde = LocalDate.of(1989, 1, 31);
		System.out.println("Naissance du meilleur formateur au monde: ");
		System.out.println(naissanceDuMeilleurFormateurDuMonde);
		
		LocalDate unAutreDate = LocalDate.of(1989, Month.MARCH, 12);
		
		System.out.println("Un ans après, nous etions");
		LocalDate premierAnniversaireDuSuperFormateur = naissanceDuMeilleurFormateurDuMonde.plusYears(1);
		System.out.println(premierAnniversaireDuSuperFormateur);
		
		System.out.println("Un an avant, nous étions le :");
		System.out.println(naissanceDuMeilleurFormateurDuMonde.minusYears(1));
		
		System.out.println("Le meilleur formateur du monde est ne un : " + naissanceDuMeilleurFormateurDuMonde.getDayOfWeek());
		
		LocalDate noel94 = LocalDate.of(1994, Month.DECEMBER, 25);
		LocalDate stValentin98 = LocalDate.of(1998, Month.FEBRUARY, 14);
		if(noel94.isBefore(stValentin98)) {
			System.out.println("Le noel 1994 s'est déroulé avant la st Valentin 1998");
		}
		
		LocalDateTime datetimeDuJour = LocalDateTime.now();
		System.out.println("Nous somme le : " + datetimeDuJour);
		
		LocalDateTime autreDateTime = LocalDateTime.of(2020, Month.APRIL, 16, 14, 54);
		System.out.println(autreDateTime);
		
		LocalDate dateDeNaissance = LocalDate.of(1989, Month.JANUARY, 31);
		long age = dateDeNaissance.until(LocalDateTime.now(), ChronoUnit.YEARS);
		System.out.println("Vous avez " + age + " ans");
		
		long ageEnJour = dateDeNaissance.until(LocalDateTime.now(), ChronoUnit.DAYS);
		System.out.println("Vous avez " + ageEnJour + " jours");
	}
}
