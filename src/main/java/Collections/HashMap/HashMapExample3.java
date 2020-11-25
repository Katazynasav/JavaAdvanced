package Collections.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample3 {
    public static void main(String[] args) {
        Map<Integer, Map<String, String>> registras = new HashMap<>();
        Map<String, String> vartotojas = new HashMap<>();
        vartotojas.put("Matas", "+370614564568");
        registras.put(1, vartotojas);
        registras.forEach((key, value) -> System.out.println(key + " -> " + value));
        Map<String, List<String>> register = new HashMap<>();
        List<String> listas = new ArrayList<>();
        listas.add("obuolys");
        listas.add("bananas");
        listas.add("Ananasas");
        register.put("Krepselis", listas);
        register.forEach((key, value) -> System.out.println(key + " ---> " + value));
    }
}
