package Streams.Example1;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsTester {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Andrew", 30);
        people.put("Thomas", 25);
        people.put("Bob", 37);
        people.put("Thomas", 21);
        people.put("Thomas", 18);
        int ages = 0;
        int counter = 0;
        for (Map.Entry<String, Integer> irasas : people.entrySet()) {
            if(irasas.getKey().equals("Thomas")) {
                ages += irasas.getValue();
                counter++;
            }
        }
        System.out.println("Thomas ages average is: " + ages/counter);
        List<String> names = Arrays.asList("John", "Sarah", "Mark", "Tyler", "Eamon");
        names = names.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println(names);
        List<Integer> numbers = Arrays.asList(5,83,6,4,23,50,61,72,1);
        numbers.stream().filter(number -> number > 4 && number < 51).forEach(System.out::println);
    }
}

