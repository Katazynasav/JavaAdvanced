package Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
    public static void main(String[] args) {
        Map<Integer, Map<String, String>> registras = new HashMap<>();
        Map<String, String> vartotojas = new HashMap<>();
        vartotojas.put("Matas", "+370614564568");
        registras.put(1, vartotojas);
        registras.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
