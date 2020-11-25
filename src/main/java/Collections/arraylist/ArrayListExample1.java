package Collections.arraylist;

import java.util.*;


public class ArrayListExample1 {
    public static void main(String[] args) {
        /*
        LIST- ordered collection of elements.
        ArrayList - implements List(interface) extends Collection(interface)
       */


        ArrayList<String> vardai = new ArrayList<>();
        vardai.add("Darius");
        vardai.add("Jonas");
        vardai.add("Marija");
        vardai.add("Karolina");

        //Program to interface and not concrete class
        List <String> varduSarasas = new ArrayList<>();
        varduSarasas.add("Figo");
        varduSarasas.add("Lina");
        varduSarasas.add("Sara");
         //basic print
        for (String vardas : varduSarasas){
            System.out.println(vardas);

        }
        // collection print
        Collections.sort(varduSarasas);

        for(String vardas : varduSarasas){
            System.out.println(vardas);

        }
        // compact print
        List<Integer> skaiciai = new ArrayList<>();
        skaiciai.add(5);
        skaiciai.add(4);
        skaiciai.add(7);
        skaiciai.add(1);

        skaiciai.forEach(System.out::println);
        System.out.println();

        skaiciai.forEach(value -> System.out.println(value));
        System.out.println();
        System.out.println("Max value: "+Collections.max(skaiciai));
        System.out.println("Min value: "+Collections.min(skaiciai));

        System.out.println();

        Iterator<Integer> integerInteger = skaiciai.iterator();
        while (integerInteger.hasNext()){
            System.out.println(integerInteger.next());

        }




    }
}
