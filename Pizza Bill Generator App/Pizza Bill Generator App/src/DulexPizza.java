public class DulexPizza extends Pizza{
    public DulexPizza(Boolean veg) {
        super(veg);

        super.addExtraCheese();
        super.addExtraTopping();
    }

    @Override
    public void addExtraCheese(){} //in here should add extra cheese and toppings when user buy dulex pizza.
                                   //So we have to override these methods
    @Override
    public void addExtraTopping(){}

}
