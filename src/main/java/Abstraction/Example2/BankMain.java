package Abstraction.Example2;

public class BankMain {
    public static void main(String[] args) {
        AbstractBank sebBank = new SEB();
        sebBank.deposit();
        sebBank.withdraw();
        sebBank.calculateSpecificBankTaxMargin();

        System.out.println("=========================");

        AbstractBank swedBank = new SwedBank();
        swedBank.deposit();
        swedBank.withdraw();
        swedBank.calculateSpecificBankTaxMargin();
    }
}
