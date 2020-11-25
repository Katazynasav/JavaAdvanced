package Inharitance.Example2;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Fido", 35);
        System.out.println(animal.getName() +" "+ animal.getWeight() + "kg");
        System.out.println("===========================");
        Dog dog = new Dog("Kira",20,"white");
        dog.setAge(3);
        System.out.println(dog.getName());
        dog.makeDogSound();
        System.out.println("======================");
        Pomeranian pom = new Pomeranian("Roki",5,"Grey");
        if (pom.isFluffy()){
            System.out.println("Roki is fluffy");
        }
        System.out.println("==========================");
        Cat cat = new Cat("Cezar",6);
    }
}
