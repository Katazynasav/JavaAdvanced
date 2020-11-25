package Abstraction.Example2;

public class SwedBank extends AbstractBank {

    @Override
    public void calculateSpecificBankTaxMargin() {
        System.out.println("We hand out loans with "+ 5 + "% margin");

    }
}
