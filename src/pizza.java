public class pizza {
    private int price;
    private Boolean veg;
    private int extracheesprice=100;
    private int extratoppingsprice=200;
    private  int backpackprice=40;
    private int basepizzaprice;
    private boolean isExtraChesseAdded=false;
    private boolean isExtraToppingsAdded=false;
    private boolean isOptedForTakeAway=false;
    public pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }

        basepizzaprice = this.price;
    }
    public void addExtraCheese(){
        isExtraChesseAdded=true;
        this.price+=extracheesprice;
    }
    public void addExtraToppings(){
        isExtraToppingsAdded=true;
        this.price+=extratoppingsprice;
    }
    public void takeAway(){
        isOptedForTakeAway=true;
        this.price+=backpackprice;

    }
    public void getBill(){
        String bill="";
        System.out.println("pizza: " +basepizzaprice);
        if(isExtraChesseAdded)
        {
            bill +="Extra Chesse Added: "+extracheesprice+ "\n";
        }
        if(isExtraToppingsAdded)
        {
            bill +="Extra Toppings Added: "+extratoppingsprice+ "\n";
        }
        if(isOptedForTakeAway)
        {
            bill +="Take Away: "+backpackprice+ "\n";
        }
        bill += "BILL: "+this.price+ "\n";
        System.out.println(bill);
    }




}
