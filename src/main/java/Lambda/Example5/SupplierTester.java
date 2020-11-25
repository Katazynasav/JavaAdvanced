package Lambda.Example5;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierTester {
    public static void main(String[] args) {
        Random random = new Random();
        double skaicius = random.nextDouble();
        Supplier<Double> randomNumberSupplier = () -> new Random().nextDouble();
        System.out.println(randomNumberSupplier.get());
        Supplier<String> randomStringSupplier = () -> new StringHelper().giveStringBack();
        System.out.println(randomStringSupplier.get());
        // Supplier<Irankis> irankiuTiekejes = () -> new Irankiai().grazinkIranki();
    }
}
class StringHelper {
    public String giveStringBack() {
        return "heloooo";
    }
}

