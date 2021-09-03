import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ExerciceDate {

	public static void main(String[] args) {
		LocalDateTime anniversaireSache = LocalDateTime.of(2021, Month.MARCH, 9, 16, 54);
		LocalDateTime now = LocalDateTime.now();
		long years = anniversaireSache.until(now, ChronoUnit.YEARS);
		anniversaireSache = anniversaireSache.plusYears(years);
		long month = anniversaireSache.until(now, ChronoUnit.MONTHS);
		anniversaireSache = anniversaireSache.plusMonths(month);
		long days = anniversaireSache.until(now, ChronoUnit.DAYS);
		anniversaireSache = anniversaireSache.plusDays(days);
		long hours = anniversaireSache.until(now, ChronoUnit.HOURS);
		anniversaireSache = anniversaireSache.plusHours(hours);
		long minutes = anniversaireSache.until(now, ChronoUnit.MINUTES);
		anniversaireSache = anniversaireSache.plusMinutes(minutes);
		long seconds = anniversaireSache.until(now, ChronoUnit.SECONDS);
		System.out.println("Sacha a " + years + " ans, " + month + " mois, " + days + " jours, " + hours + " heures, " + minutes + " minutes et " + seconds + " secondes");
		
		LocalDateTime delta = LocalDateTime.now();
		LocalDateTime startTime = LocalDateTime.now();
		boolean running = true;
		while(running) {
			LocalDateTime currentTime = LocalDateTime.now();
			if(delta.until(currentTime, ChronoUnit.SECONDS) >= 5) {
				System.out.println(currentTime.getMinute() + ":" + currentTime.getSecond());
				delta = LocalDateTime.now();
			}
			
			if(startTime.until(currentTime, ChronoUnit.SECONDS) > 30) {
				running = false;
			}
		}
		
		System.out.println("Fin du programme");
	}

}
