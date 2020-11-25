package SOLID.Inversion;
//1.High level modules should not depend on low level models.Both should depend on abstractions.
//2.Abstractions should not depend on details.Details should depend on abstractions.
public class BackEndDeveloper implements Developer {
    public void writeJava(){
        System.out.println("I am coding in JAVA");
    }

    @Override
    public void develop() {
        writeJava();
    }
}
