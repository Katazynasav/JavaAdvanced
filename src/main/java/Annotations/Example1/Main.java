package Annotations.Example1;

public class Main {
    public static void main(String[] args) {

    ChildClass childClass = new ChildClass();
    childClass.doChildStuff();
    childClass.actingLikeAParent();
    ParentClass parentClass = new ParentClass();
    parentClass.doSomeNewStuff();
}
}
