package Collections.HashSet;
        /*
        HashSet is the implementation of Set Interface which uses Hash table for storing the data.
        Hash table internally uses a phenomena known as hashing,
        Hash set does not maintains the insertion order,
        that is when we retrieve values from it  we do not get that values in the same order as we have entered in it.*/


import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        /*
        NO duplicates allowed
        Return elements in not predictable order
        */

        Set<String> rinkinys = new HashSet<>();
        rinkinys.add("Tom");
        rinkinys.add("Hanna");
        rinkinys.add("Sarah");
        System.out.println("HashSet values : " + rinkinys.spliterator().getExactSizeIfKnown());

        for (String vardas : rinkinys) {
            System.out.println(vardas);

        }
        rinkinys.clear();
        System.out.println("Set is now empty - " + rinkinys.isEmpty());


    }

}
