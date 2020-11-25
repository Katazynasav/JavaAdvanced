package Collections.LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.Set;

/*
LinkedSet is the ordered version of HashSet.
The only difference between HashSet and LinkedHashSet is
that: LinkedHashSet maintains the insertion order.
When we iterate through a HashSet, the order is unpredictable while
it is predictable in case of LinkedHashSet.
 */
public class LinkedHashSetExample1 {
    public static void main(String[] args) {
        Set<Integer> linkedHashSetOfIntegers = new LinkedHashSet<>();
        linkedHashSetOfIntegers.add(5);
        linkedHashSetOfIntegers.add(9);
        linkedHashSetOfIntegers.add(1);
        linkedHashSetOfIntegers.add(2);
        linkedHashSetOfIntegers.add(3);
        //does not allow us to have dublicates


        for (Integer skaicius : linkedHashSetOfIntegers){
            System.out.println(skaicius);

        }


    }

}
