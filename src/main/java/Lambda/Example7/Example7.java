package Lambda.Example7;

import java.util.function.UnaryOperator;

public class Example7 {
    public static void main(String[] args) {
        UnaryOperator<Integer> toSquareOperator = i -> {
            int result = i*i;
            System.out.println("Daugybos rezultatas : " + result);
            return result;
        };
        toSquareOperator.apply(12);
    }
}


