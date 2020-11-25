package Collections.Vector;

import java.util.List;
import java.util.Vector;

/*Vector is very much similar to ArrayList, but with few differences,
firstly Vector is thread safe, where as Arraylist is not.
Secondly, Vector is synchronized, where as Arraylist is not,
So performance of Vector is low than ArrayList.
Vector increases its size by 100 % that is it doubles its size when total number of elements exceeds
its capacity whereas ArrayList increases by 50 % of current array size.
Vector can use Enumeration interface as well as Iterator to traverse over its elements.
Vector is a legacy Class, that is it is introduced before JDK 1.2.
Vector doubles its size when elements exceeds its initial capacity.
Vector can use both Enumeration as well as Iterator to traverse elements.
Vector is synchronized.
Vector is Thread Safe.
Vectors can be used for Multi Threading.
Vector is slow as compared to Array List.
     */
public class VectorExample1 {
    public static void main(String[] args) {
        System.out.println("Vector implements List ,allows duplicate");
        Vector<Integer> vectorOfInteger = new Vector<>();
        vectorOfInteger.add(5);
        vectorOfInteger.add(9);
        vectorOfInteger.add(3);
        vectorOfInteger.add(1);
        vectorOfInteger.add(8);
        vectorOfInteger.add(2);
        vectorOfInteger.add(6);
        vectorOfInteger.add(2);


        System.out.println(vectorOfInteger);
        vectorOfInteger.add(3,123451);
        System.out.println(vectorOfInteger);
        System.out.println();
        System.out.println("Vector capasity is : " + vectorOfInteger.capacity());
    }
}
