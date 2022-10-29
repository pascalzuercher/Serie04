import java.util.Random;

public class Dice {

	// maximale Punktezahl des W�rfels
	public final int MAX = 6;



	// aktuelle Punktezahl des W�rfels
	private int points;

	// Objekt zur Erzeugung von Zufallszahlen
	private Random randomGenerator;

	/**
	 * instanziiert einen neuen W�rfel und initialisiert die Variablen
	 */
	public Dice() {
		this.randomGenerator = new Random();
		this.points = 1;
	}

	//"wirft" den W�rfel (setzt die Punktezahl auf eine zuf�llige, g�ltige Zahl)
	public int roll() {
		this.points = this.randomGenerator.nextInt(MAX) + 1;
		return this.points;
	}

	 //setzt die aktuelle Punktezahl des W�rfels auf den �bergebenen Wert
	public void setPoints(int points) {
		if (points >= 1 && points <= MAX)
			this.points = points;
		else
			this.printMessage("Unzulässige Eingabe. " + "Würfel wird nicht verändert.");
	}

	 //gibt die aktuelle Punktezahl des Würfels zurück
	public int getPoints() {
		return this.points;
	}

	//gibt eine Systemmeldung aus
	private void printMessage(String message) {
		System.out.println(message);
	}
}
