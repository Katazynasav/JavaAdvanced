package fluentinterface;

import java.util.ArrayList;
import java.util.List;

public class MenuImpl implements Menu {

    private List<Pizza> menuOrderList = new ArrayList<>();
    private List<Pizza> selectedPizzasList = new ArrayList<>();
    public MenuImpl() {
        Pizza margarita = new Pizza() {
            @Override
            public Pizza getName() {
                System.out.println("1. Margarita");
                return this;
            }
            @Override
            public Pizza getIngridients() {
                System.out.println("Ketchup, cheese, lots of cheese.");
                return this;
            }
            @Override
            public Integer getCost() {
                return 5;
            }
        };
        Pizza hawai = new Pizza() {
            @Override
            public Pizza getName() {
                System.out.println("2. Hawai");
                return this;
            }
            @Override
            public Pizza getIngridients() {
                System.out.println("Ketchup, cheese, lots of ANANAS, ANANAS");
                return this;
            }
            @Override
            public Integer getCost() {
                return 8;
            }
        };
        menuOrderList.add(margarita);
        menuOrderList.add(hawai);
    }
    @Override
    public Menu orderPizza(List<Integer> orders) {
        System.out.println("Order pizza: ");
        for(Integer order : orders) {
            Pizza pizza = menuOrderList.get(order);
            selectedPizzasList.add(pizza);
            pizza.getName().getIngridients();
        }
        return this;
    }
    @Override
    public Menu payPizza() {
        int cost = 0;
        for (Pizza pizza : selectedPizzasList) {
            cost = cost + pizza.getCost();
        }
        System.out.println("Total price: " + cost +" $");
        return this;
    }
    @Override
    public Pizza getPizza(int menuIndex) {
        return menuOrderList.get(menuIndex);
    }
    public void showMenu() {
        System.out.println("MENU");
        for (Pizza pizza : menuOrderList) {
            pizza.getName().getIngridients().getCost();
        }
    }
}