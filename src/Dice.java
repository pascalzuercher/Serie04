<<<<<<< HEAD
=======
package serie04;

>>>>>>> origin/main
import java.util.Random;

public class Dice {

<<<<<<< HEAD
	// maximale Punktezahl des W�rfels
	public final int MAX = 6;

	// aktuelle Punktezahl des W�rfels
=======
	// maximale Punktezahl des W�rfels
	public final int MAX = 6;

	// aktuelle Punktezahl des W�rfels
>>>>>>> origin/main
	private int points;

	// Objekt zur Erzeugung von Zufallszahlen
	private Random randomGenerator;

	/**
<<<<<<< HEAD
	 * instanziiert einen neuen W�rfel und initialisiert die Variablen
=======
	 * instanziiert einen neuen W�rfel und initialisiert die Variablen
>>>>>>> origin/main
	 */
	public Dice() {
		this.randomGenerator = new Random();
		this.points = 1;
	}

	/**
<<<<<<< HEAD
	 * "wirft" den W�rfel (setzt die Punktezahl auf eine zuf�llige, g�ltige Zahl)
=======
	 * "wirft" den W�rfel (setzt die Punktezahl auf eine zuf�llige, g�ltige Zahl)
>>>>>>> origin/main
	 */
	public int roll() {
		this.points = this.randomGenerator.nextInt(MAX) + 1;
		return this.points;
	}

	/**
<<<<<<< HEAD
	 * setzt die aktuelle Punktezahl des W�rfels auf den �bergebenen Wert
=======
	 * setzt die aktuelle Punktezahl des W�rfels auf den �bergebenen Wert
>>>>>>> origin/main
	 */
	public void setPoints(int points) {
		if (points >= 1 && points <= MAX)
			this.points = points;
		else
<<<<<<< HEAD
			this.printMessage("Unzul�ssige Eingabe. " + "W�rfel wird nicht ver�ndert.");
	}

	/**
	 * gibt die aktuelle Punktezahl des W�rfels zur�ck
=======
			this.printMessage("Unzul�ssige Eingabe. " + "W�rfel wird nicht ver�ndert.");
	}

	/**
	 * gibt die aktuelle Punktezahl des W�rfels zur�ck
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
