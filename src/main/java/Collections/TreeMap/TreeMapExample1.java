package Collections.TreeMap;

import java.util.Map;
import java.util.TreeMap;

/*TreeMap also stores values based on the corresponding key.
  It stores only unique keys, that is duplicate keys are not allowed.
  Also it cannot store key as null but it can store null values.
  It is mostly similar to HashMap except it maintains natural order of keys.
  If key is of integer type it arranges them in increasing order, or if they are of string type,
  it arranges them in dictionary order.*/
public class TreeMapExample1 {
    public static void main(String[] args) {
        Map<Integer,String>treeMap =new TreeMap<>();
        treeMap.put(1,"Dario");
        treeMap.put(2,"Mario");
        treeMap.put(3,"Darija");
        treeMap.put(4,"Sara");
        treeMap.put(5,"Kara");

        if( treeMap.containsValue("Adriano")) {
            System.out.println("Yes there is a person in the map");
        } else {
            System.out.println("He does not exist.");
        }


        treeMap.forEach((key,value)-> System.out.println(key + " -> " + value));
    }
}
