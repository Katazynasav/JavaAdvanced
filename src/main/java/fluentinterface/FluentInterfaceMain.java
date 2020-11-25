package fluentinterface;

import java.util.ArrayList;
import java.util.List;

public class FluentInterfaceMain {
    public static void main(String[] args) {
        List<Integer> selections = new ArrayList<>();
        selections.add(0);
        selections.add(1);
        new RestaurantImpl().generateName("Best Pizza place").generateMenu()
                .orderPizza(selections).payPizza().getPizza(0);
    }
}


