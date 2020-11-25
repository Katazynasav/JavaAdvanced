package OrelIReshka;

import java.util.Random;

public class Coin {
    public final static int OREL = 1;
    public final static int RESHKA = 0;

    private int faceUp;

    public Coin(int faceUp) {
        this.faceUp = faceUp;
    }
    public void flip (){
        Random ram = new Random();
        faceUp = ram.nextInt(2);
    }
    public String getFaceUp() {
        if (faceUp == OREL) {
            return "OREL";
        } else if (faceUp == RESHKA) {
            return "RESHKA";
        } else {
            return "INVALID";

        }

    }
}
