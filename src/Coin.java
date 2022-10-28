import java.util.Random;
import java.lang.Math;
public class Coin {
    private boolean side;

    public Coin(){
        this.side=flip();
    }

    public boolean getSide() {
        return side;
    }

    public void setSide(boolean side) {
        this.side = side;
    }

    public boolean flip(){
        Random rand = new Random();
        double sidenum = rand.nextInt(0,2);
        return sidenum == 1;
    }

    @Override
    public boolean equals(Coin coinobj) {
        if (this.side == coinobj.getSide())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return side ? "Kopf" : "Zahl";
    }
}
