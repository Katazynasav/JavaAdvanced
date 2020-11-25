package Abstraction.Example2;

public abstract class AbstractBank {
    public void deposit(){
        System.out.println("Depositing money to the bank.");
    }
    public void withdraw(){
        System.out.println("Taking money from the bank.");
    }

    public abstract void calculateSpecificBankTaxMargin();
}
