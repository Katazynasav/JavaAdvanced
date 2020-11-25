package Annotations.Example1;

public class ParentClass {
    @Deprecated // senas metodas kuris yra pakeistas nauju arba jau keiciamas.
    public void actingLikeAParent(){
        System.out.println("acting like a parent...");
    }
    public void doSomeNewStuff(){
        System.out.println("Doing some new stuff...");
    }
}
