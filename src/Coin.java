import java.util.Random;
public class Coin {
    private boolean side;

    // Pascal Zürcher, Matrikelnummer: 22-111-314
// Leandro Lüthi. Matrikelnummer: 22-105-035


    public Coin(){
        flip();
    }

    public boolean getSide() {
        return side;
    }

    public void flip(){
        Random rand = new Random();
        if(rand.nextInt(0, 2)==1)
            this.side = true;
        else
            this.side = false;
    }

    @Override
    public boolean equals(Object coinobj) {
        if(this == coinobj)
            return true;
        else if(coinobj==null || getClass() != coinobj.getClass())
            return false;
        Coin coin = (Coin) coinobj;
        return getSide() == coin.getSide();
    }

    @Override
    public String toString() {
        return side ? "Kopf" : "Zahl";
    }
}
