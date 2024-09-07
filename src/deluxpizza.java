public class deluxpizza extends pizza{
    public deluxpizza(Boolean veg) {
        super(veg);
        super.addExtraCheese();
        super.addExtraToppings();
    }
    @Override
    public void addExtraCheese(){}
    @Override
    public void addExtraToppings(){}
   }

