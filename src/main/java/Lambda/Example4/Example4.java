package Lambda.Example4;

import java.util.function.Function;

public class Example4 {
    public static void main(String[] args) {
        // Naujas Java 8 funkcionalumas
        Function<String, Integer> stringLength = s -> s.length();
        System.out.println(stringLength.apply("ilgaEiluteBlaBlaBla"));
        // Traktorius traktorius = new Traktorius();
        // traktorius.vaziuok();
        // traktorius.rinkBulves();
        // traktorius.vaziuokAtbulomis();
        // TRAKTORIAUS OBJEKTO GALIMA NEKURTI:
        // Traktorius:: vaziuok;
        // Traktorius:: rinkBulves;
        // Traktorius:: vaziuokAtbulomis;
        // senuoju būdu
        System.out.println("ilgaEiluteBlaBlaBla".length());
        // Naujas Java 8 funkcionalumas
        Function<String, String> replaceCommasWithDots = s -> s.replaceAll(",", ".");
        System.out.println(replaceCommasWithDots.apply("a,b,c,d,e,f"));
        // senuoju būdu
        System.out.println("a,b,c,d,e,f".replaceAll(",", "*"));
        // atskiras metodas
        System.out.println(doMyOwnReplace("a,b,c,d,e,f"));
    }
    private static String doMyOwnReplace(String eilute) {
        return eilute.replaceAll(",", "-");
    }
}
