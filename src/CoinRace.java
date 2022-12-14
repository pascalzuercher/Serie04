// Pascal Zürcher, Matrikelnummer: 22-111-314
// Leandro Lüthi. Matrikelnummer: 22-105-035


public class CoinRace {
    public static void main(String[] args) {
        //Variablen
        int round=1, countc1=0, countc2=0;

        //Instanzierung
        Coin coin1 = new Coin();
        Coin coin2 = new Coin();

        //Schleife, zur Simulation des Münzen werfens
        do{
            if (coin1.getSide())countc1++;
            else countc1=0;
            if(coin2.getSide()) countc2++;
            else countc2=0;
            System.out.println("Runde "+round+": "+coin1+" "+coin2);
            coin1.flip();
            coin2.flip();
            round++;
        }while(countc1<3 && countc2<3);

        //Ausgabe des Siegers
        if(countc1==3 && countc2==3)
            System.out.println("Unentschieden!");
        else if(countc1==3)
            System.out.println("Münze 1 gewinnt!");
        else if(countc2==3)
            System.out.println("Münze 2 gewinnt!");
        else
            System.out.println("Etwas ist schiefgegangen");
        //else programmiert, damit im Notfall nicht ein falscher Gewinner ausgegeben wird


        // Testen der equals-Methode
        System.out.println(" ");
        System.out.println("Die Münzen sind: "+coin1+" und "+coin2);
        System.out.println(coin1.equals(coin2));
    }
}
