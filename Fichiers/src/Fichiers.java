import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Fichiers {

	public static void main(String[] args) {
		//lecture d'un fichier
		Path path  = Path.of("C:\\Users\\PC7\\Documents\\foo.txt");
		String fileContent = "";
		try (BufferedReader reader = Files.newBufferedReader(path)) {
		    String line = null;
		    while ((line = reader.readLine()) != null) {
		        fileContent += line.toUpperCase() + "\n";
		    }
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
		
		//écriture d'un fichier
		Path pathOutput  = Path.of("C:\\Users\\PC7\\Documents\\foo2.txt");
		try (BufferedWriter writer = Files.newBufferedWriter(pathOutput)) {
		    writer.write(fileContent, 0, fileContent.length());
		} catch (IOException x) {
		    System.err.format("IOException: %s%n", x);
		}
	}

}
