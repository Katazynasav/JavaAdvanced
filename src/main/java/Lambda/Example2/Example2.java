package Lambda.Example2;

import java.util.function.Predicate;

public class Example2 {
    public static void main(String[] args) {
        //Predicate interface represents a predicate, which is a boolean
        //valued function of one argument
        Predicate<String> startsWithABCtest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCtest.test("ABCDEF"));
        Predicate<Integer> integerPredicate = new MyFancyPredicate();
        System.out.println(integerPredicate.test(10));
    }
}
class MyFancyPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer integer) {
        return integer > 5;
    }
}

