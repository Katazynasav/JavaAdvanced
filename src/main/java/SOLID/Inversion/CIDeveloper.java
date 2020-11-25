package SOLID.Inversion;

public class CIDeveloper implements Developer {
    @Override
    public void develop() {
        doCIstuff();
    }
    private void doCIstuff() {
        System.out.println("I am integrating system modules.");
    }
}