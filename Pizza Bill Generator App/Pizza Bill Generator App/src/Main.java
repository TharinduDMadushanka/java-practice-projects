// OOP ---> Method Override & Inheritance

public class Main {
    public static void main(String[] args) {

        //Pizza.userMenu();

        Pizza basePizza =new Pizza(false);
        basePizza.addExtraTopping();
        basePizza.addExtraCheese();
        basePizza.takeAway();
        basePizza.getBill();

        System.out.println("============================================");

        DulexPizza dp =new DulexPizza(true);
        dp.takeAway();
        dp.getBill();
    }
}