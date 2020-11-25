package Lambda.Example6;

import java.util.function.UnaryOperator;

public class Example6 {
    public static void main(String[] args) {
        UnaryOperator<Integer> toSquareOperator = integer -> integer * integer * integer;
        System.out.println(toSquareOperator.apply(5));
        System.out.println(pakelkKubu(5));
    }
    private static int pakelkKubu(int i) {
        return i * i * i;
    }
}

