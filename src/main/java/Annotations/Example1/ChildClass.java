package Annotations.Example1;

public class ChildClass extends ParentClass {
    public void doChildStuff(){
        System.out.println("acting like a child...");
    }

    @Override
    public void actingLikeAParent() {
        super.actingLikeAParent();
    }



}
