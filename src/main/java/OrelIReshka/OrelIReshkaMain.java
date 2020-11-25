package OrelIReshka;

public class OrelIReshkaMain {
    public static void main(String[] args) {
        Coin coin = new Coin(Coin.RESHKA);
        System.out.println("Face of the coin " + coin.getFaceUp());
        for (int i = 0;i <10;i++){
            coin.flip();
        System.out.println("Win: " + coin.getFaceUp());
        }
    }
}
