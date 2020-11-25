package Lambda.Example1;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
    List<Integer>skaiciai = Arrays.asList(1,2,3,4,5,6,7,8,9);

    //old good way
    for (Integer skacius : skaiciai ){
        System.out.println(skacius);
    }
        System.out.println("==========================");
    //lambda way
        skaiciai.forEach(skacius -> System.out.println(skacius));
        System.out.println("==========================");
        skaiciai.forEach(System.out ::println);

        List<Integer>filteredList = skaiciai.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println("==========================");
        System.out.println("Filetered number list");
        System.out.println(filteredList);

        for(Integer skaicius : skaiciai){
            if (skaicius > 5){
                skaicius = skaicius + 5;
                filteredList.add(skaicius);
            }
        }
    }

}
