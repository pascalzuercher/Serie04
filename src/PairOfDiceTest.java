// Pascal Zürcher, Matrikelnummer: 22-111-314
// Leandro Lüthi. Matrikelnummer: 22-105-035



public class PairOfDiceTest {
    public static void main(String[] args) {
        PairOfDice pair = new PairOfDice();

        //Test der GetterMethode
        System.out.println("Würfel instanziert und beide auf 1: "
                +pair.getPoints()[0]+" und "+pair.getPoints()[1]);

        //Test Würfel werfen
        pair.throwDice();
        System.out.println("neu gewürfelt: "+pair.getPoints()[0]+" und "+pair.getPoints()[1]);

        //Test der Summen Methode
        System.out.println("Die Summe ist: "+pair.total());

        //Test Setter und toString
        pair.setPoints(2,4);
        System.out.println(pair);
    }
}
