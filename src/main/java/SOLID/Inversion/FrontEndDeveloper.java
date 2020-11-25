package SOLID.Inversion;

public class FrontEndDeveloper implements Developer {
    public void writeJavaScript(){
        System.out.println("I code in JS");
    }

    @Override
    public void develop() {
        writeJavaScript();
    }
}
