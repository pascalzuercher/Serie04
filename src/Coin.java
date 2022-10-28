import java.util.Random;
import java.lang.Math;
public class Coin {
    boolean side;
    public Coin(){
        this.side=flip();
    }

    public boolean flip(){
        Random rand = new Random();
        double sidenum = rand.nextInt(0,2);
        return sidenum == 1;
    }

    @Override
    public boolean equals(Object obj) {
        //To Do
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Die Seite ist: "+side;
    }
}
