package fluentinterface;

import java.util.List;

public interface Menu  {
    //picos uzsakymas
    Menu orderPizza(List<Integer> orders);

    //sumoketi uz pica
    Menu payPizza();

    //gauti pica

    Pizza getPizza(int menuIndex);
}
