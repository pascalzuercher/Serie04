public class PairOfDiceTest {
    public static void main(String[] args) {
        PairOfDice pair = new PairOfDice();
        System.out.println(pair.getPoints());
        pair.throwDice();
        System.out.println(pair.getPoints());
    }
}
