package fluentinterface;

public class RestaurantImpl implements Restaurant {
    private String name;
    @Override
    public Restaurant generateName(String name) {
        this.name = name;
        System.out.println("You have entered restaurant called '" + name + "'");
        return this;
    }
    @Override
    public Menu generateMenu() {
        MenuImpl menu = new MenuImpl();
        menu.showMenu();
        return menu;
    }
}