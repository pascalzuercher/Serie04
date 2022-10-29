<<<<<<< HEAD
=======
package serie04;

>>>>>>> origin/main
import java.util.Random;

public class Dice {

<<<<<<< HEAD
	// maximale Punktezahl des Wï¿½rfels
	public final int MAX = 6;

	// aktuelle Punktezahl des Wï¿½rfels
=======
	// maximale Punktezahl des Würfels
	public final int MAX = 6;

	// aktuelle Punktezahl des Würfels
>>>>>>> origin/main
	private int points;

	// Objekt zur Erzeugung von Zufallszahlen
	private Random randomGenerator;

	/**
<<<<<<< HEAD
	 * instanziiert einen neuen Wï¿½rfel und initialisiert die Variablen
=======
	 * instanziiert einen neuen Würfel und initialisiert die Variablen
>>>>>>> origin/main
	 */
	public Dice() {
		this.randomGenerator = new Random();
		this.points = 1;
	}

	/**
<<<<<<< HEAD
	 * "wirft" den Wï¿½rfel (setzt die Punktezahl auf eine zufï¿½llige, gï¿½ltige Zahl)
=======
	 * "wirft" den Würfel (setzt die Punktezahl auf eine zufällige, gültige Zahl)
>>>>>>> origin/main
	 */
	public int roll() {
		this.points = this.randomGenerator.nextInt(MAX) + 1;
		return this.points;
	}

	/**
<<<<<<< HEAD
	 * setzt die aktuelle Punktezahl des Wï¿½rfels auf den ï¿½bergebenen Wert
=======
	 * setzt die aktuelle Punktezahl des Würfels auf den übergebenen Wert
>>>>>>> origin/main
	 */
	public void setPoints(int points) {
		if (points >= 1 && points <= MAX)
			this.points = points;
		else
<<<<<<< HEAD
			this.printMessage("Unzulï¿½ssige Eingabe. " + "Wï¿½rfel wird nicht verï¿½ndert.");
	}

	/**
	 * gibt die aktuelle Punktezahl des Wï¿½rfels zurï¿½ck
=======
			this.printMessage("Unzulässige Eingabe. " + "Würfel wird nicht verändert.");
	}

	/**
	 * gibt die aktuelle Punktezahl des Würfels zurück
>>>>>>> origin/main
	 */
	public int getPoints() {
		return this.points;
	}

	/**
	 * gibt eine Systemmeldung aus
	 */
	private void printMessage(String message) {
		System.out.println(message);
	}
}
