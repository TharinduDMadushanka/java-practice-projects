public class Pizza {

    private int price;
    private Boolean veg;
    private int extraCheesePrice=100;
    private int extraToppingPrice=150;
    private int backPackPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdd=false;
    private boolean isExtraToppingAdd=false;
    private boolean isTakeAway=false;

    public Pizza(Boolean veg){
        this.veg=veg;
        if (this.veg){
            this.price=300;
        }else {
            this.price=400;
        }
        basePizzaPrice=this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdd =true;
        this.price+=extraCheesePrice;
    }

    public void addExtraTopping(){
        isExtraToppingAdd=true;
        this.price+=extraToppingPrice;
    }

    public void takeAway(){
        isTakeAway=true;
        this.price+=backPackPrice;
    }

    public void getBill(){
        String bill="";
        System.out.println("Pizza: "+basePizzaPrice);
        if (isExtraCheeseAdd){
            System.out.println("Extra cheese added:" + extraCheesePrice);
        }
        if (isExtraToppingAdd){
            System.out.println("Extra Topping added:" + extraToppingPrice);
        }
        if (isTakeAway){
            System.out.println("Take Away:" + backPackPrice);
        }
        System.out.println("Bill: "+this.price);
    }
}
