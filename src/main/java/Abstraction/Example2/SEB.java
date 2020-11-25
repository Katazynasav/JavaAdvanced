package Abstraction.Example2;

public class SEB extends AbstractBank {

    @Override
    public void calculateSpecificBankTaxMargin() {
        System.out.println("We hand out loans with "+ 3 + "% margin");
    }
}
