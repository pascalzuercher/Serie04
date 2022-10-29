import java.util.Arrays;
public class PairOfDice {
    private Dice dice1, dice2;

    public PairOfDice(){
        this.dice1 = new Dice();
        this.dice2 = new Dice();
    }

    public void throwDice(){
        dice1.roll();
        dice2.roll();
    }

    public int[] getPoints(){
        int[] arr = new int[]{dice1.getPoints(), dice2.getPoints()};
        return arr;
    }

    public void setPoints(int pd1, int pd2){
        dice1.setPoints(pd1);
        dice2.setPoints(pd2);
    }

    public int total(){
        return dice1.getPoints() + dice2.getPoints();
    }

    @Override
    public String toString() {
        return "Die Würfel zeigen: "+dice1.getPoints()+" und "+dice2.getPoints();
    }
}
